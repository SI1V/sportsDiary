package ru.sportsDiary.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Exercise;
import ru.sportsDiary.service.ExerciseService;

import java.util.List;

@RestController
@RequestMapping(value = "/exercises")
@Tag(name="Упражнения", description="Методы для работы с сущностью упражнения")
public class ExerciseController {

    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<Exercise> findAll() {
        return exerciseService.findAll();
    }

    @GetMapping("/{id}")
    public Exercise getExerciseById(@PathVariable("id") Long id) {
        return exerciseService.getExerciseById(id).orElse(null);
    }

    @PostMapping
    public Exercise createExercise(@RequestBody Exercise exercise) {
        return exerciseService.saveExercise(exercise);
    }

//    @PutMapping("/{id}")
//    public Exercise updateExercise(@PathVariable("id") Long id, @RequestBody Exercise exercise) {
//        exercise.setExerciseId(id);
//        return exerciseService.saveExercise(exercise);
//    }

    @DeleteMapping("/{id}")
    public void deleteExercise(@PathVariable("id") Long id) {
        exerciseService.deleteExercise(id);
    }
}
