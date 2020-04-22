package com.sunrise.day04;

import java.util.Scanner;

/**
 * 引用类型使用步骤：
 * 1.导包:只有java.lang下的类不用导；
 * 2.创建:进行new对象；
 * 3.调用:对象.成员方法()。
 */

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("输入的数字：" + i);
        String str = sc.next();
        System.out.println("输入的字符串" + str);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = sc1.nextInt();
        System.out.println("输入第二个数：");
        int b = sc1.nextInt();
        int result = a + b;
        System.out.println("数字和="+result);

    }

}