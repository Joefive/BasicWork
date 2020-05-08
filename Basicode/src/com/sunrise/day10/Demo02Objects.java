package com.sunrise.day10;

import java.util.Objects;

/**
 * JDK7中新加入的工具类
 * Objects.equals可以过滤掉空指针异常，使用为空的值进行比较
 * 源码如下：
 * public static boolean equals(Object a, Object b) {
 * return (a == b) || (a != null && a.equals(b));
 * }
 */
public class Demo02Objects {
    public static void main(String[] args) {
        String s = null;
        String s1 = "abc";
        String s2 = "aBc";
        boolean b = s1.equals(s2);
        System.out.println(b);
        //boolean d = s.equals(s2);
        boolean e = Objects.equals(s, s2);
        System.out.println(e);

        int num = 10;
        int num1 = 10;
        System.out.println(s1.equals(s2));

        double total = 100D;
        double cost = 0D;
        double avg = 0D;
        System.out.println(avg);

        /**
         * Java中任何正数除以0(int)，报错；
         * 除以0.0(浮点型)，为无穷大Infinity
         * NaN定义：public static final double NaN = 0.0d / 0.0
         */

        if (Objects.equals(cost, 0.0)) {
            avg = total / cost;
            System.out.println("=====");
        }
        System.out.println(avg);
        System.out.println(100.0 / 0);
        System.out.println(0.0 / 0);
        System.out.println(0.0 / 0.0);

    }
}
