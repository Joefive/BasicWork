package com.sunrise.day02;


/**
 * 重载：方法名称相同，但是参数个数不同
 * 1.重载可以是参数个数不同；2.重载可以是参数类型不同。
 * 与参数名称、方法返回值类型无关。
 */

public class Day02DemoOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4));
        byte a = 10;
        byte b = 10;
        System.out.println(isSame(a, b));
        myPrintln("warframe");
    }

    //1.重载可以是参数个数不同
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //2.重载可以是参数类型不同
    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        return (int) (a + b);
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte比较");
        return a == b ? true : false;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short比较");
        return a == b ? true : false;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int比较");
        return a == b ? true : false;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long比较");
        return a == b ? true : false;
    }

    public static void myPrintln(byte a) {
        System.out.println(a);
    }

    public static void myPrintln(short a) {
        System.out.println(a);
    }

    public static void myPrintln(String str) {
        System.out.println(str);
    }
}
