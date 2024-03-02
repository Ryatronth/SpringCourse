package org.example.springcourse.services;

import org.example.springcourse.models.Boss;
import org.example.springcourse.models.Programmer;
import org.example.springcourse.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


@Configuration
 class WorkService {
    private Worker programmer;
    private Worker programmer1;
    // DI через поле
    @Autowired
    @Qualifier("boss")
    private Worker boss;


    // DI через конструктор
    public WorkService(@Qualifier("programmer") Worker programmer) {
        this.programmer = programmer;
    }

    // DI через сеттер
    @Autowired
    public void setProgrammer1(@Qualifier("programmer") Worker programmer1) {
        this.programmer1 = programmer1;
    }

    public void allWork() {
        boss.work();
        programmer.work();
        programmer1.work();
    }
}
