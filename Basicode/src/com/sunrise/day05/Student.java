package com.sunrise.day05;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCount = 0;

    public Student() {
        this.id = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    static{
        System.out.println("静态代码块，仅执行一次，在第一次实例化，静态代码块优先执行放入静态池中！");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
