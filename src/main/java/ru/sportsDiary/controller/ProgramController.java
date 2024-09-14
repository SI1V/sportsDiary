package ru.sportsDiary.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Program;
import ru.sportsDiary.service.ProgramService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/programs")
@Tag(name="Программы", description="Методы для работы со спортивными программами")
public class ProgramController {

    private final ProgramService programService;

    @Autowired
    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    public List<Program> getAllPrograms() {
        return programService.getAllPrograms();
    }

    @GetMapping("/{id}")
    public Program getProgramById(@PathVariable("id") Long id) {
        Optional<Program> optionalProgram = programService.getProgramById(id);
        return optionalProgram.orElse(null);
    }

    @PostMapping
    public Program createProgram(@RequestBody Program program) {
        return programService.saveProgram(program);
    }

//    @PutMapping("/{id}")
//    public Program updateProgram(@PathVariable("id") Long id, @RequestBody Program program) {
//        program.setProgramId(id);
//        return programService.saveProgram(program);
//    }

    @DeleteMapping("/{id}")
    public void deleteProgram(@PathVariable("id") Long id) {
        programService.deleteProgram(id);
    }
}
