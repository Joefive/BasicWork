package com.sunrise.day03;

/**
 * 成员变量
 * 成员方法：成员方法没有static
 * 成员变量：1.写在方法外，类的内部；2.作用域在整个类都可以使用；3.会有默认值。
 * 局部变量：2.写在方法内；2.作用域在方法内；3.没有默认值需要手动赋值。
 * 注意：方法参数是局部变量，但是不赋值可以使用，因为方法被调用的时候一定会赋值。
 */
public class Day0302Student {
    String name = "张三";
    int age = 18;

    public void eat() {
        System.out.println("我会吃饭...!");
    }

    public void study() {
        System.out.println("我会学习...!");
    }

    public void sleep() {
        System.out.println("我会睡觉...!");
    }
}
