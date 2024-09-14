package ru.sportsDiary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sportsDiary.entity.Program;
import ru.sportsDiary.repository.ProgramRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {

    private final ProgramRepository programRepository;

    @Autowired
    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Transactional
    public Optional<Program> getProgramById(Long id) {
        return programRepository.findById(id);
    }
    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

//    public Optional<Program> getProgramById(Long id) {
//        return programRepository.findById(id);
//    }

    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }

    public void deleteProgram(Long id) {
        programRepository.deleteById(id);
    }
}
