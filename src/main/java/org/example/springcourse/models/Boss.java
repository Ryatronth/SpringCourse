package org.example.springcourse.models;

public class Boss implements Worker{

    @Override
    public void work() {
        System.out.println("Я заставляю программиста писать код.");
    }
}
