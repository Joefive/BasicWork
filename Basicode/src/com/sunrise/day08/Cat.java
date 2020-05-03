package com.sunrise.day08;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
    public void catWalk(){
        System.out.println("走猫步...!");
    }
}
