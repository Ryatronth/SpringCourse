package org.example.springcourse.services;

import org.example.springcourse.models.Boss;
import org.example.springcourse.models.Programmer;
import org.example.springcourse.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
 class WorkService {

    private Programmer programmer;
    private Programmer programmer1;
    // DI через поле
    @Autowired
    private Boss boss;


    // DI через конструктор
    @Autowired
    public WorkService(Programmer programmer) {
        this.programmer = programmer;
    }

    // DI ерез сеттер
    @Autowired
    public void setProgrammer1(Programmer programmer1) {
        this.programmer1 = programmer1;
    }

    public void allWork() {
        boss.work();
        programmer.work();
        programmer1.work();
    }
}
