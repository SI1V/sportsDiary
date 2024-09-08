package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.Program;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    // Поиск всех программ для конкретного атлета
    List<Program> findByAthleteId(Long athleteId);
}

