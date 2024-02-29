package org.example.springcourse.models;

public class Programmer implements Worker{
    @Override
    public void work() {
        System.out.println("Я пишу код");
    }
}
