package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.WorkoutSet;
import ru.sportsDiary.repository.WorkoutSetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutSetService {

    private final WorkoutSetRepository workoutSetRepository;

    @Autowired
    public WorkoutSetService(WorkoutSetRepository workoutSetRepository) {
        this.workoutSetRepository = workoutSetRepository;
    }

    public List<WorkoutSet> getAllWorkoutSets() {
        return workoutSetRepository.findAll();
    }

    public Optional<WorkoutSet> getWorkoutSetById(Long id) {
        return workoutSetRepository.findById(id);
    }

    public List<WorkoutSet> getWorkoutSetsByWorkoutExerciseId(Long workoutExerciseId) {
        return workoutSetRepository.findByWorkoutExerciseId(workoutExerciseId);
    }

    public WorkoutSet saveWorkoutSet(WorkoutSet workoutSet) {
        return workoutSetRepository.save(workoutSet);
    }

    public void deleteWorkoutSet(Long id) {
        workoutSetRepository.deleteById(id);
    }
}
