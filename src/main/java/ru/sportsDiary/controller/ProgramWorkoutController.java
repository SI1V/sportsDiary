package ru.sportsDiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.ProgramWorkout;
import ru.sportsDiary.service.ProgramWorkoutService;

import java.util.List;

@RestController
@RequestMapping(value = "/program-workouts")
public class ProgramWorkoutController {

    private final ProgramWorkoutService programWorkoutService;

    @Autowired
    public ProgramWorkoutController(ProgramWorkoutService programWorkoutService) {
        this.programWorkoutService = programWorkoutService;
    }

    @GetMapping
    public List<ProgramWorkout> getAllProgramWorkouts() {
        return programWorkoutService.getAllProgramWorkouts();
    }

    @GetMapping("/{id}")
    public ProgramWorkout getProgramWorkoutById(@PathVariable("id") Long id) {
        return programWorkoutService.getProgramWorkoutById(id).orElse(null);
    }

    @PostMapping
    public ProgramWorkout createProgramWorkout(@RequestBody ProgramWorkout programWorkout) {
        return programWorkoutService.saveProgramWorkout(programWorkout);
    }

    @PutMapping("/{id}")
    public ProgramWorkout updateProgramWorkout(@PathVariable("id") Long id, @RequestBody ProgramWorkout programWorkout) {
        programWorkout.setProgramWorkoutId(id);
        return programWorkoutService.saveProgramWorkout(programWorkout);
    }

    @DeleteMapping("/{id}")
    public void deleteProgramWorkout(@PathVariable("id") Long id) {
        programWorkoutService.deleteProgramWorkout(id);
    }
}
