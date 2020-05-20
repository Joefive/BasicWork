package com.sunrise.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的顶层父类Throwable，两个子类Error、Exception
 * exception：1.编译期异常，2.运行期异常；【可预知可恢复】java运行过程中出错，小毛病，可治愈；
 * error：程序错误，无法运行
 * 异常处理方式：
 * 1.抛出异常，交给虚拟机处理，虚拟机会中断程序；
 * 2.写try，catch语句进行捕获异常，捕获后打印出来，程序可以继续执行；
 * 异常和错误区别：异常捕获后处理后代码可以继续执行，错误是必须修改代码
 */

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        /*1.异常*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = sdf.parse("2020-02-20"); //格式错误会产生异常
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("1.后续代码执行！");

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("2.后续代码执行！");

        /*2.错误*/
        //OutOfMemoryError: Java heap space,内存溢出，数组长度太大
        //int[] arr2 = new int[1024*1024*1024];

        /**
         * 异常产生过程：
         * 1.程序执行过程中根据异常产生原因创建一个异常对象，这个异常对象包含(内容，原因，位置)；
         * 2.在checkArray方法中没有try，catch捕获，就转交给main方法处理；
         * 3.main方法也没有处理异常，再返回给JVM进行处理，JVM接收到将异常打印在控制台，并中断程序；
         */
        int[] arr3 = {11,22,33};
        int i = checkArray(arr3,3);
        System.out.println(i);
        System.out.println("3.后续代码！！1");
    }

    public static int checkArray(int[] arr,int index) {
        int i = arr[index];
        return i;
    }
}
