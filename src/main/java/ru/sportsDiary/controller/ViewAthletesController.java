package ru.sportsDiary.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sportsDiary.entity.Athlete;
import ru.sportsDiary.service.AthleteService;
import java.util.List;
@Controller
@RequestMapping("/all")  // Базовый URL для контроллера
public class ViewAthletesController {
    private final AthleteService athleteService;
    @Autowired
    public ViewAthletesController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }
    // Отобразить список всех атлетов
    @GetMapping
    public String viewAllAthletes(Model model) {
        List<Athlete> athletes = athleteService.findAll(); // Получаем список всех атлетов
        model.addAttribute("athletes", athletes); // Добавляем список атлетов в модель

        // Проверка на пустой список атлетов
        if (athletes.isEmpty()) {
            model.addAttribute("message", "Нет атлетов для отображения.");
        }
        // Возвращаем имя HTML-шаблона для отображения
        return "athletes";
    }
}