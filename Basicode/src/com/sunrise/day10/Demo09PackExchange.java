package com.sunrise.day10;

/**
 * 基本类型转换成字符串类型
 * 1.基本类型+"";
 * 2.使用包装类的静态方法toString(参数)；
 * 3.使用String类的valueOf()方法；
 * 字符串转换成基本类型：
 * 1.使用包装类的静态方法parseXXX的方法(数值类型的字符串);
 */
public class Demo09PackExchange {
    public static void main(String[] args) {
        int a = 10;
        String b = a + "";
        System.out.println(b + 666);
        String s2 = Integer.toString(a);
        System.out.println(s2 + 999);
        String s3 = String.valueOf(a);
        System.out.println(s3 + 333);
        System.out.println("==================");
        int i1 = Integer.parseInt(s3);
        System.out.println(i1 - 1);

    }
}
