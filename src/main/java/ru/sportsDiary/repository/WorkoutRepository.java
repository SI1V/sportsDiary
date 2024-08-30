package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}

