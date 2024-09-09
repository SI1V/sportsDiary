package ru.sportsDiary.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "API приложения 'Спортивный дневник'",
                description = "sportsDiary", version = "1.0.0",
                contact = @Contact(
                        name = "S-i1-V"
                )
        )
)
public class OpenApiConfig {

}
