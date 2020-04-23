package com.sunrise.day04;

import java.util.Scanner;

/**
 * 匿名对象：只有右边的对象没有左边的名字和赋值运算符
 * new 对象();
 * 匿名对象是能使用一次。
 * 如果确定一个对象只使用一次，那么可以使用匿名对象
 * 1.匿名对象可以作为参数；2.匿名对象可以作为返回值。
 */

public class Demo02Anonymous {
    public static void main(String[] args) {
        //Person one = new Person();
        //one.name = "张二";
        //one.sayName();
        //new Person().name = "张三";

        //匿名方式进行调用
        int num = new Scanner(System.in).nextInt();
        System.out.println("[1]输入的数字是：" + num);

        //匿名对象作为方法参数
        methodParam(new Scanner(System.in));

        //匿名对象作为返回值
        Scanner sc2 = methodReturn();
        int num2 = sc2.nextInt();
        System.out.println("[3]输入的数字是：" + num2);
    }

    public static void methodParam(Scanner sc) {
        int num1 = sc.nextInt();
        System.out.println("[2]输入的数字是：" + num1);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
