package ru.sportsDiary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.Sportsman;
import ru.sportsDiary.repository.SportsmanRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SportsmanService {

    private final SportsmanRepo sportsmanRepo;

    public List<Sportsman> getAllSportsmen() {
        return sportsmanRepo.findAll();
    }

    public Optional<Sportsman> getSportsmanById(Long id) {
        return sportsmanRepo.findById(id);
    }

    public Sportsman saveSportsman(Sportsman sportsman) {
        return sportsmanRepo.save(sportsman);
    }

    public void deleteSportsman(Long id) {
        sportsmanRepo.deleteById(id);
    }
}
