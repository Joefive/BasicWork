package com.sunrise.day01;
/**
 * 数据转换：1.隐式转换：从小到大，从右到左；
 *          2.强制转换：从大到小，右边加括号加转换类型，可能会有数据溢出；
 *          byte,short,char之间进行计算会默认提升为int进行计算,boolean不能类型转换。
 */
public class Demo03DataType {
    public static void main(String[] args) {
        long num1 = 100;
        System.out.println("num1=" + num1);
        double num2 = 2.55F;
        System.out.println("num2=" + num2);
        float num3 = 30L;
        System.out.println("num3=" + num3);
        int num4 = (int)100L;
        System.out.println("num4=" + num4);
        int num5 = (int)10000000000000L;
        System.out.println("num5=" + num5);
        int num6 = (int)3.99;
        System.out.println("num6="+num6);
        char name1 = 'A';
        System.out.println("name1="+(name1+1));
        byte num7=12;
        short num8 =18;
        int result1 = num7+num8;
        System.out.println("result1="+(num7+num8));

        /**
         * ASCII码表对应美国American Standard Code for Information Interchange
         * Unicode万国码表
         */
        char name2 = 'A';
        System.out.println("name2对应ASCII码值："+(name2+0));
        char name3 = '汉';
        System.out.println(name3+0);

    }
}
