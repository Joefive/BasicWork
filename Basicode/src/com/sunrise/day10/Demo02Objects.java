package com.sunrise.day10;

import java.util.Objects;

/**
 * JDK7中新加入的工具类
 * Objects可以过滤掉空指针异常，使用为空的值进行比较
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

    }
}
