package com.sunrise.day03;

/**
 * 成员变量与局部变量重名的时候，就近原则：优先使用局部变量；
 * 成员方法中参数名称与成员变量相同的时候使用this
 * 需要访问成员变量的时候使用this关键字this.成员变量名
 * 通过谁调用的方法，谁就是this
 */

public class Boy {
    String name;

    public void sayHello(String name) {
        System.out.println(name + "你好！我是" + this.name);
        System.out.println(this);
    }
}
