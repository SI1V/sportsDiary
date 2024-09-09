package ru.sportsDiary.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Workout;
import ru.sportsDiary.service.WorkoutService;

import java.util.List;

@RestController
@RequestMapping(value = "/workouts")
@Tag(name = "Тренировка")
public class WorkoutController {

    private final WorkoutService workoutService;

    @Autowired
    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public Workout getWorkoutById(@PathVariable("id") Long id) {
        return workoutService.getWorkoutById(id).orElse(null);
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutService.saveWorkout(workout);
    }

//    @PutMapping("/{id}")
//    public Workout updateWorkout(@PathVariable("id") Long id, @RequestBody Workout workout) {
//        workout.setWorkoutId(id);
//        return workoutService.saveWorkout(workout);
//    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable("id") Long id) {
        workoutService.deleteWorkout(id);
    }
}
