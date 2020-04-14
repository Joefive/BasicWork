package com.sunrise.day02;

/**
 * 修饰符 返回值类型 方法名称（参数类型 参数名）
 * 注意：不能再方法内部定义一个方法
 * 参数：参数有多个用逗号
 * 返回值：return,返回值要和方法类型相同
 */

public class Day02DemoMethod {
    public static void main(String[] args) {
        printMethod();  //单独调用
        System.out.println(sum(1, 2)); //打印调用
        int c = sum(2, 2); //赋值调用
        System.out.println("c=" + c);
        printSum(6,6);
    }

    /**
     * void方法只能被单独调用，不能用打印、赋值调用
     * 没有返回值
     */
    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
