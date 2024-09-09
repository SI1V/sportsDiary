package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.Athlete;
import ru.sportsDiary.repository.AthleteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteService {

    private final AthleteRepository athleteRepository;

    @Autowired
    public AthleteService(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public List<Athlete> findAll() {
        return athleteRepository.findAll();
    }

    public Optional<Athlete> getAthleteById(Long id) {
        return athleteRepository.findById(id);
    }

    public Athlete saveAthlete(Athlete athlete) {
        return athleteRepository.save(athlete);
    }

    public void deleteAthlete(Long id) {
        athleteRepository.deleteById(id);
    }
}
