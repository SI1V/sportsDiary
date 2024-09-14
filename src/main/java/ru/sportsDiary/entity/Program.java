package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "programs", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    private Long programId;

    @Column(name = "program_name", nullable = false)
    private String programName;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Column(name = "program_description")
    private String programDescription;

    @Column(name = "athlete_id", nullable = false)
    private Long athleteId;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "program_workouts", // Название промежуточной таблицы
//            joinColumns = @JoinColumn(name = "program_id"), // Внешний ключ для Program
//            inverseJoinColumns = @JoinColumn(name = "workout_id") // Внешний ключ для Workout
//    )
//    private List<Workout> workouts; // Связь с тренировками

    // Связь "один ко многим" с тренировками
    @OneToMany(mappedBy = "workoutId", cascade = CascadeType.ALL)
    private List<Workout> workouts = new ArrayList<>();
}
