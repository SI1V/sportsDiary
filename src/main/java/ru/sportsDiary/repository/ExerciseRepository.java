package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.Exercise;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByIsDefault(Boolean isDefault);
    List<Exercise> findByIsDefaultAndExerciseType(Boolean isDefault, String exerciseType);
}
