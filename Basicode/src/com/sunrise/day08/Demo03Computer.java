package com.sunrise.day08;

import com.sunrise.day08.laptop.*;

/**
 * 电脑接口案例：
 * 1.接口的实现，需要实现了里面的抽象方法；
 * 2.接口的向上转型【左编译右运行】；
 * 3.接口的向下转型【instanceof关键字进行比较】；
 * 4.接口也可以作为参数进行传递。
 */

public class Demo03Computer {
    public static void main(String[] args) {
        Computer co = new Computer();
        //电脑开机
        co.powerOn();
        //鼠标对象向上转型，左编译右运行，运行的时候鼠标类重写了接口中的open,close方法
        USB usb = new Mouse();
        //电脑userDiver方法参数是USB类型，所以对鼠标向上转型
        co.useDiver(usb);

        /**
         * 直接传入键盘对象也可以，因为键盘实现了USB接口，相当于向上转型
         */
        KeyBoard key = new KeyBoard();
        co.useDiver(key);
        //co.useDiver(new KeyBoard());

        //电脑关机
        co.powerOff();
        System.out.println("======================");

        //类型转换测试
        method(10.12);
        method(20);
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
