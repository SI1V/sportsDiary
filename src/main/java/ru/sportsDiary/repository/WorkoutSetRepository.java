package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.WorkoutSet;

import java.util.List;

@Repository
public interface WorkoutSetRepository extends JpaRepository<WorkoutSet, Long> {
    // Поиск всех сетов для конкретного упражнения
    List<WorkoutSet> findByWorkoutExercise_WorkoutExerciseId(Long workoutExerciseId);
}
