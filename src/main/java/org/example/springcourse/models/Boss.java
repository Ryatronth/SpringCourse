package org.example.springcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("boss")
public class Boss implements Worker{

    @Override
    public void work() {
        System.out.println("Я заставляю программиста писать код.");
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
