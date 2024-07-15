package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.Sportsman;
import ru.sportsDiary.repository.SportsmanRepo;

import java.util.List;
import java.util.Optional;

@Service
public class SportsmanService {

    private final SportsmanRepo sportsmanRepo;

    @Autowired
    public SportsmanService(SportsmanRepo sportsmanRepo) {
        this.sportsmanRepo = sportsmanRepo;
    }

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
