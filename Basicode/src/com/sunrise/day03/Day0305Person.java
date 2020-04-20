package com.sunrise.day03;

public class Day0305Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name="张学友";
        p.setAge(-20);
        p.show();

        Student stu = new Student();
        stu.setAge(18);
        stu.setName("张三丰");
        stu.setMale(true);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.isMale());

    }
}
