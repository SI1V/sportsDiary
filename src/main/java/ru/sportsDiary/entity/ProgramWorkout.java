package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "program_workouts", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgramWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_workout_id")
    private Long programWorkoutId;

    @ManyToOne
    @JoinColumn(name = "program_id", nullable = false)
    private Program program;

    @ManyToOne
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;
}
