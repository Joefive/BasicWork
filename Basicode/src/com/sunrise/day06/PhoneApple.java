package com.sunrise.day06;

/**
 * supper方法：
 * 1.使用父类成员变量；
 * 2.访问父类成员方法；
 * 3.在子类构造方法中访问父类构造方法。
 * this()调用本类中的构造方法，只能放在构造方法的第一行，第一个语句，唯一一个；
 * this关键字的用法：
 * 1.调用本类中的成员变量；
 * 2.调用本类中的成员方法；
 * 3.调用本类中的构造方法(构造方法的重载调用)。
 * this()调用本类中的构造方法，只能放在构造方法的第一行，第一个语句，唯一一个；
 */

public class PhoneApple extends Phone {
    String name = "韩一";

    public PhoneApple() {
        //super();
        super(666);
        System.out.println("2.子类构造方法PhoneApple()！");
    }
    public PhoneApple(String name){
        this();
        System.out.println("2-2.子类的构造方法PhoneApple()"+name);
    }

    @Override
    public void showNumber() {
        String name = "韩二";
        super.showNumber();
        System.out.println("新增功能：显示头像！" + this.name);
        System.out.println("新增功能：显示地点！");
    }
    public void methodA(){
        System.out.println("子类成员方法methodA被调用了");

    }
    public void methodB(){
        this.methodA();
    }
}
