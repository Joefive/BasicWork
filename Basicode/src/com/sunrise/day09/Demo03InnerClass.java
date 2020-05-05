package com.sunrise.day09;

import com.sunrise.day09.packThree.*;

/**
 * 类表示某种事物，如果某种事物中还包含一种事物，成为内部类
 * 例如：身体和心脏、汽车和发送机
 * 内部类的分类：1.成员内部类；2.局部内部类；
 * 调用方法：
 * 1.间接调用：再外部类的成员方法中调用内部类的方法，然后在new外部类对象，直接调用外部类成员方法；
 * 2.直接调用：外部类.内部类 对象名 = new 外部类().new 内部类()；
 * 外部类修饰符：只能使用public,(default)；
 * 成员内部类修饰符：public,protected,(default),private；
 * 局部内部类修饰符：什么不都能写。
 */
public class Demo03InnerClass {
    public static void main(String[] args) {
        Body body = new Body("张三");
        body.methodBody();
        System.out.println("===============");
        Body.Heart heart = new Body("李四").new Heart();
        heart.beat();
        System.out.println("===============");
        Outer.Inner oi = new Outer().new Inner();
        oi.method(); //调用重名局部变量
        System.out.println("===============");
        //局部内部类
        Outer out1 = new Outer();
        out1.methodOuter();
    }
}
