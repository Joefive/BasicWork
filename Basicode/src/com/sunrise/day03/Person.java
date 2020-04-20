package com.sunrise.day03;

/**
 * private只能在当前类中使用
 * 需要访问private类型的参数必须使用getAge，setAge
 */

public class Person {
    private int age;
    String name;

    public void show() {
        System.out.println("我叫" + name + "，今年" + age + "岁。");
    }

    public void setAge(int age) {
        if (age < 100 && age > 18) {
            this.age = age;
        } else {
            System.out.println("年龄设置不合适！");
        }


    }

    public int getAge() {
        return age;
    }
}
