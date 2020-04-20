package com.sunrise.day03;

/**
 * 对于基本数据类型boolean类型，他的getXxx方法必须写成isXxx。
 */

public class Student {
    private String name;
    private int age;
    private boolean male;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
