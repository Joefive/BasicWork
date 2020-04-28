package com.sunrise.day06;

/**
 * 1.关于继承的方法重写的设计原则：
 * 对于已经投入使用的类，不建议直接修改，建议重新定义类，利用重复内容，并添加改动内容
 * 继承老的方法使用super.方法名()
 * 2.子类继承父类：实例化子类的时候必须调用父类构造方法super()，如果不写，默认创建无参数构造；
 * 子类可以通过super关键字来调用父类重载构造
 * 子类调用父类super构造函数，只能放在子类构造方法的第一行，只能调用一个父类构造函数。
 */

public class Demo04InheritOverride {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.sendMessage();
        p.showNumber();
        System.out.println("============");

        PhoneApple pa = new PhoneApple();
        pa.call();
        pa.sendMessage();
        pa.showNumber();
        pa.methodB();
        System.out.println("============");
        PhoneApple paa = new PhoneApple("韩五");
    }
}
