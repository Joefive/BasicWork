package com.sunrise.day02;

public class Day0201DemoIsSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(20, 20));
        System.out.println(sumNum(1, 100));
        printHello(3);
    }

    /**
     * 比较两个数是否相同
     *
     * @param a
     * @param b
     * @return
     */

    public static boolean isSame(int a, int b) {
        //return a==b;
        return a == b ? true : false;
    }

    /**
     * 给出两个参数计算从a到b的和
     *
     * @param a
     * @param b
     * @return
     */
    public static int sumNum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 制定方法打印输出几次
     * @param a
     */
    public static void printHello(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("hello..world!");
        }
    }


}
