package com.sunrise.day15;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void doRun() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + " : " + i);
        }
    }
}
