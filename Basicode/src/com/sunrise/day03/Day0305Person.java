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

        Boy boy = new Boy();
        boy.name="Sam";
        boy.sayHello("刘老师");
        System.out.println(boy);

        Student stu2 = new Student("张全蛋",19);
        System.out.println("我叫："+stu2.getName()+"，今年："+stu2.getAge());
        stu2.setAge(20);
        System.out.println("我叫："+stu2.getName()+"，过年后："+stu2.getAge());
    }
}
