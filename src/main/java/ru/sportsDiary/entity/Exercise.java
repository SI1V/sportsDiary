package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercises", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private Long exerciseId;

    @Column(name = "exercise_name", nullable = false)
    private String exerciseName;

    @Column(name = "exercise_description")
    private String exerciseDescription;

    @Column(name = "muscle_group")
    private String muscleGroup;

    @Column(name = "exercise_type", nullable = false)
    private String exerciseType;

    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

    @Column(name = "is_default", nullable = false)
    private Boolean isDefault;
}
