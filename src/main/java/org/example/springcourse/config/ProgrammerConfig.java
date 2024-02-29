package org.example.springcourse.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.springcourse.models.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammerConfig {

    @Bean
    public Programmer boss() {
        return new Programmer();
    }

    @PostConstruct
    public void construct() {
        System.out.println("Программист создан");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Программист уничтожен");
    }
}
