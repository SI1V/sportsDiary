package ru.sportsDiary.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sportsDiary.repository.SportsmanRepo;
import ru.sportsDiary.service.SportsmanService;

@Configuration
public class SportsmanConfig {

    @Bean
    public SportsmanService sportsmanService(SportsmanRepo sportsmanRepo) {
        return new SportsmanService(sportsmanRepo);
    }
}