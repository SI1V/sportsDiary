package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.WorkoutExercise;

import java.util.List;

@Repository
public interface WorkoutExerciseRepository extends JpaRepository<WorkoutExercise, Long> {
    // Поиск всех упражнений, связанных с конкретной тренировкой
    List<WorkoutExercise> findByWorkoutExerciseId(Long workoutId);
}

