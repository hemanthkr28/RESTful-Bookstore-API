package com.example.bookstore.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Bookstore API",
                version = "1.0",
                description = "API for managing books and authors in a bookstore"
        )
)
public class SwaggerConfig {
    // No bean definitions needed here as Springdoc-openapi auto-configures the rest.
}
