package org.example.springcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer implements Worker{
    @Override
    public void work() {
        System.out.println("Я пишу код");
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
