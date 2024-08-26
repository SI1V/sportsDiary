package ru.sportsDiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Athlete;
import ru.sportsDiary.service.AthleteService;

import java.util.List;

@RestController
@RequestMapping(value = "/athletes")
public class AthleteController {

    private final AthleteService athleteService;

    @Autowired
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping
    public List<Athlete> getAllAthletes() {
        return athleteService.getAllAthlete();
    }

    @GetMapping("/{id}")
    public Athlete getAthleteById(@PathVariable("id") Long id) {
        return athleteService.getAthleteById(id).orElse(null);
    }

    @PostMapping
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteService.saveAthlete(athlete);
    }

    @PutMapping("/{id}")
    public Athlete updateAthlete(@PathVariable("id") Long id, @RequestBody Athlete athlete) {
        athlete.setId(id);
        return athleteService.saveAthlete(athlete);
    }

    @DeleteMapping("/{id}")
    public void deleteAthlete(@PathVariable("id") Long id) {
        athleteService.deleteAthlete(id);
    }
}
