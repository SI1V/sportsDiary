package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workout_sets")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "set_id")
    private Long setId;

    @ManyToOne
    @JoinColumn(name = "workout_exercise_id", nullable = false)
    private WorkoutExercise workoutExercise;

    @Column(name = "set_order", nullable = false)
    private Integer setOrder;

    @Column(name = "weight_kg", nullable = false)
    private Double weightKg;

    @Column(name = "reps", nullable = false)
    private Integer reps;

    @Column(name = "duration_seconds")
    private Integer durationSeconds;
}
