package ru.sportsDiary.controller;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Athlete;
import ru.sportsDiary.service.AthleteService;

import java.util.List;

@RestController
@RequestMapping(value = "/athletes")
@Tag(name="Спортсмены", description="Методы для работы с сущностью спортсмены")
public class AthleteController {

    private final AthleteService athleteService;

    @Autowired
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping
    public List<Athlete> getAllAthletes() {
        return athleteService.findAll();
    }

    @GetMapping("/{id}")
    public Athlete getAthleteById(@PathVariable("id") Long id) {
        return athleteService.getAthleteById(id).orElse(null);
    }

    @PostMapping
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteService.saveAthlete(athlete);
    }


    @DeleteMapping("/{id}")
    public void deleteAthlete(@PathVariable("id") Long id) {
        athleteService.deleteAthlete(id);
    }
}
