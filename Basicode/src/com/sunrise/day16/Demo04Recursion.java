package com.sunrise.day16;

import java.io.File;

/**
 * 递归概念：方法自己调用自己；构造函数不能使用递归；内存溢出问题；
 * 特点：1.先找临界值；2.本次执行与上一次执行的关系；3.调用函数本身加上一次；
 * 缺点：开辟大量栈内存；
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        //求和
        int sum = sum(100);
        System.out.println("sum:" + sum);
        //阶乘5！
        int factorial = factorial(5);
        System.out.println("阶乘：" + factorial);
        System.out.println("==================");
        //遍历文件夹中所有内容
        File file = new File("E:\\BAK");
        checkIndex(file);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static void checkIndex(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            //判断是否为目录，如果是目录进行递归，调用自己
            if (f.isDirectory()) {
                checkIndex(f); //【递归调用自己】
            } else {
                System.out.println(f);
            }
        }
    }
}