package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sportsDiary.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
}

