package com.sunrise.day15;

/**
 * 并发：多个线程使用一个CPU，CUP交替执行
 * 并行：同时执行，多线程使用多个CPU，多个CUP可以同时处理不同的线程；
 * 主线程：Main方法进栈后，JVM会提供一条CPU路径 ，开启主线程；
 * 单线程弊端：单线程发生异常后会影响后续程序运行。
 */
public class Demo05MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("张一");
        p1.doRun();
        System.out.println(0 / 0); //异常：分母不能为0
        Person p2 = new Person("张二");
        p2.doRun();
    }


}
