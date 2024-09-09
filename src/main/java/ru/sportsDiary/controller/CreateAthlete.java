package ru.sportsDiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.sportsDiary.entity.Athlete;
import ru.sportsDiary.service.AthleteService;

@Controller
@RequestMapping("/athlete")  // Базовый URL для контроллера
class CreateAthleteController {

    private final AthleteService athleteService;

    @Autowired
    public CreateAthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    // Показать форму для создания нового атлета
    @GetMapping("/create")
    public String showCreateAthleteForm(Model model) {
        model.addAttribute("athlete", new Athlete()); // Передаем пустой объект Athlete в модель
        return "create"; // Имя HTML-шаблона для отображения формы
    }

    // Обработать форму создания нового атлета
    @PostMapping("/create")
    public String createAthlete(@ModelAttribute Athlete athlete) {
        athleteService.saveAthlete(athlete); // Сохраняем нового атлета через сервис
        return "athletes"; // Редирект на список всех атлетов после успешного создания
    }
}
