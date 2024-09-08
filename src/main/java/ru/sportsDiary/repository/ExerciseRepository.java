package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.Exercise;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    // Поиск всех упражнений, созданных по умолчанию
    List<Exercise> findByIsDefault(Boolean isDefault);

    // Поиск всех упражнений для конкретного атлета
    List<Exercise> findByIsDefaultOrAthleteId(Boolean isDefault, Long athleteId);
}
