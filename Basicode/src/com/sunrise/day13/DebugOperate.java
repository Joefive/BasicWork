package com.sunrise.day13;

/**
 * F8逐行执行；
 * F7进入方法中
 * SHIFT+F8跳出方法；
 * F9跳到下个断点；
 */

public class DebugOperate {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        int sum = a+b;
        System.out.println(sum);
        demo01();
    }

    private static void demo01() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
