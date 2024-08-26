package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sportsDiary.entity.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
}
