package ru.sportsDiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.WorkoutSet;
import ru.sportsDiary.service.WorkoutSetService;

import java.util.List;

@RestController
@RequestMapping(value = "/workout-sets")
public class WorkoutSetController {

    private final WorkoutSetService workoutSetService;

    @Autowired
    public WorkoutSetController(WorkoutSetService workoutSetService) {
        this.workoutSetService = workoutSetService;
    }

    @GetMapping
    public List<WorkoutSet> getAllWorkoutSets() {
        return workoutSetService.getAllWorkoutSets();
    }

    @GetMapping("/{id}")
    public WorkoutSet getWorkoutSetById(@PathVariable("id") Long id) {
        return workoutSetService.getWorkoutSetById(id).orElse(null);
    }

    @PostMapping
    public WorkoutSet createWorkoutSet(@RequestBody WorkoutSet workoutSet) {
        return workoutSetService.saveWorkoutSet(workoutSet);
    }

    @PutMapping("/{id}")
    public WorkoutSet updateWorkoutSet(@PathVariable("id") Long id, @RequestBody WorkoutSet workoutSet) {
        workoutSet.setSetId(id);
        return workoutSetService.saveWorkoutSet(workoutSet);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkoutSet(@PathVariable("id") Long id) {
        workoutSetService.deleteWorkoutSet(id);
    }
}
