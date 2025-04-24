package com.web.soft.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationMessageConfig {

    @Bean
    public MessageSource messageSource() {
        return new YamlMessageSource("messages");
    }
}

