package com.sunrise.day08;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头>===:》");
    }
    public void catchMouse(){
        System.out.println("狗拿耗子!!!");
    }
}
