package com.sunrise.day16;

/**
 * 递归概念：方法自己调用自己；构造函数不能使用递归；内存溢出问题；
 * 特点：1.先找临界值；2.本次执行与上一次执行的关系；3.调用函数本身加上一次；
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        int sum = sum(3);
        System.out.println(sum);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;

    }

}