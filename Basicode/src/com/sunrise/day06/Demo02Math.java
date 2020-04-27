package com.sunrise.day06;


import java.util.ArrayList;

/**
 * 数学类：
 * 1.绝对值：public static double abs(double num)
 * 2.向上取整：public static double ceil(double num)
 * 3.向下取整：public static double floor(double num)
 * 4.四舍五入：public static double round(double num)
 * Math.PI:代表近似的圆周率
 */
public class Demo02Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(2.21));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-3.123));

        System.out.println(Math.ceil(3.123));
        System.out.println(Math.ceil(3.999));

        System.out.println(Math.floor(9.9));
        System.out.println(Math.floor(31.0));

        System.out.println(Math.round(20.14));
        System.out.println(Math.round(21.501));

        double pi = Math.PI;
        System.out.println("圆周率：" + pi);

        //练习：计算在-10.8至5.9之间，绝对值大于6或小于2.1的整数有多少？
        //1.使用向下取整，在使用绝对值判断区间；
        //2.可以使用int强制转换(将double进行强制转换成int既可取消后面的小数)。
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        ArrayList<Double> intArray = new ArrayList<>();
        for (double i = Math.ceil(min); i < max; i++) { //int i = (int)min;i<max
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                intArray.add(Math.abs(i));
                count++;
            }
        }
        String str = intArray.toString();
        System.out.println("大于6或小于2.1区间总共有" + count + "个数字：" + str);
    }
}
