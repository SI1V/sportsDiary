package ru.sportsDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sportsDiary.entity.Sportsman;

public interface SportsmanRepo extends JpaRepository<Sportsman, Long> {
}
