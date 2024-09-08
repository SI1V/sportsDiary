package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.WorkoutSet;
import ru.sportsDiary.repository.WorkoutSetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutSetService {

    @Autowired
    private WorkoutSetRepository workoutSetRepository;

    public List<WorkoutSet> getAllWorkoutSets() {
        return workoutSetRepository.findAll();
    }

    public Optional<WorkoutSet> findWorkoutSetById(Long id) {
        return workoutSetRepository.findById(id);
    }

    public List<WorkoutSet> findSetsByWorkoutExerciseId(Long workoutExerciseId) {
        return workoutSetRepository.findByWorkoutExercise_WorkoutExerciseId(workoutExerciseId);
    }

    public WorkoutSet saveWorkoutSet(WorkoutSet workoutSet) {
        return workoutSetRepository.save(workoutSet);
    }

    public void deleteWorkoutSet(Long id) {
        workoutSetRepository.deleteById(id);
    }
}
