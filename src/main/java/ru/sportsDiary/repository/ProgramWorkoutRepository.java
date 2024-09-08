package ru.sportsDiary.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.ProgramWorkout;

import java.util.List;

@Repository
public interface ProgramWorkoutRepository extends JpaRepository<ProgramWorkout, Long> {
    // Поиск всех тренировок, связанных с программой
    List<ProgramWorkout> findByProgramId(Long programId);
}
