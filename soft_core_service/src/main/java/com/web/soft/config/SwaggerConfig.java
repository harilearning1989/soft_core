package com.web.soft.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Soft Core Software Solutions")
                        .version("1.0")
                        .description("This is the API documentation for my Spring Boot app")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("John Doe")
                                .url("http://www.softcoresolutions.com")
                                .email("hari.learning189@gmail.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0")));
    }
}

