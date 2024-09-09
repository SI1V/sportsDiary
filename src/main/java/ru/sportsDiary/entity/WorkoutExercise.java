package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workout_exercises", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workout_exercise_id")
    private Long workoutExerciseId;

    @ManyToOne
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;
// TODO: удалить поля и сравнить с моделью в БД
//    @Column(name = "comments")
//    private String comments;
//
//    @Column(name = "reps")
//    private Integer reps;
//
//    @Column(name = "weight_kg")
//    private Double weightKg;
//
//    @Column(name = "duration_seconds")
//    private Integer durationSeconds;
}
