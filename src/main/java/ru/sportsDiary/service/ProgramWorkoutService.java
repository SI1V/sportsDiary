package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sportsDiary.entity.ProgramWorkout;
import ru.sportsDiary.repository.ProgramWorkoutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramWorkoutService {

    private final ProgramWorkoutRepository programWorkoutRepository;

    @Autowired
    public ProgramWorkoutService(ProgramWorkoutRepository programWorkoutRepository) {
        this.programWorkoutRepository = programWorkoutRepository;
    }

    public List<ProgramWorkout> getAllProgramWorkouts() {
        return programWorkoutRepository.findAll();
    }

    public Optional<ProgramWorkout> getProgramWorkoutById(Long id) {
        return programWorkoutRepository.findById(id);
    }

    public ProgramWorkout saveProgramWorkout(ProgramWorkout programWorkout) {
        return programWorkoutRepository.save(programWorkout);
    }

    public void deleteProgramWorkout(Long id) {
        programWorkoutRepository.deleteById(id);
    }
}
