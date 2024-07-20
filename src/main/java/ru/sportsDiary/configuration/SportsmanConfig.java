package ru.sportsDiary.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.sportsDiary.repository.SportsmanRepo;
import ru.sportsDiary.service.SportsmanService;

@Configuration
@ComponentScan
public class SportsmanConfig {
}
