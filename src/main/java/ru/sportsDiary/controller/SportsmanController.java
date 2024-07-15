package ru.sportsDiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Sportsman;
import ru.sportsDiary.response.SportsmanResponse;
import ru.sportsDiary.service.SportsmanService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sportsmen")
public class SportsmanController {

    private final SportsmanService sportsmanService;

    @Autowired
    public SportsmanController(SportsmanService sportsmanService) {
        this.sportsmanService = sportsmanService;
    }

    @GetMapping
    public ResponseEntity<List<SportsmanResponse>> getAllSportsmen() {
        List<Sportsman> sportsmen = sportsmanService.getAllSportsmen();
        List<SportsmanResponse> response = sportsmen.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SportsmanResponse> getSportsmanById(@PathVariable("id") Long id) {
        return sportsmanService.getSportsmanById(id)
                .map(this::mapToResponse)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SportsmanResponse> createSportsman(@RequestBody Sportsman sportsman) {
        Sportsman savedSportsman = sportsmanService.saveSportsman(sportsman);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(mapToResponse(savedSportsman));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SportsmanResponse> updateSportsman(@PathVariable("id") Long id, @RequestBody Sportsman sportsman) {
        sportsman.setId(id);
        Sportsman updatedSportsman = sportsmanService.saveSportsman(sportsman);
        return ResponseEntity.ok(mapToResponse(updatedSportsman));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSportsman(@PathVariable("id") Long id) {
        sportsmanService.deleteSportsman(id);
        return ResponseEntity.noContent().build();
    }

    private SportsmanResponse   mapToResponse(Sportsman sportsman) {
        return new SportsmanResponse(
                sportsman.getId(),
                sportsman.getLastName(),
                sportsman.getFirstName(),
                sportsman.getMiddleName(),
                sportsman.getBirthDate(),
                sportsman.getHeight(),
                sportsman.getWeight()
        );
    }
}
