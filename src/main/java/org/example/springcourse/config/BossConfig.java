package org.example.springcourse.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.springcourse.models.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BossConfig {

    @Bean
    public Boss boss() {
        return new Boss();
    }

    @PostConstruct
    public void construct() {
        System.out.println("Босс создан");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Босс уничтожен");
    }
}
