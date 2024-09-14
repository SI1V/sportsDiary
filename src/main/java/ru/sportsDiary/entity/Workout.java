package ru.sportsDiary.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "workouts", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workout_id")
    private Long workoutId;

    @Column(name = "workout_date", nullable = false)
    private java.sql.Date workoutDate;

    @Column(name = "workout_description")
    private String workoutDescription;

    @Column(name = "total_weight")
    private Integer totalWeight;

    @Column(name = "recorded")
    private Boolean recorded;

    @Column(name = "month_id")
    private Integer monthId;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Exercise> exercises = new ArrayList<>();

    @Column(name = "workout_comments")
    private String workoutComments;

    @ManyToOne
    @JoinColumn(name = "athlete_id", nullable = false)
    private Athlete athlete;
}
