package com.sunrise.day15;

/**
 * 多线程：
 * 程序都是自上而下执行的，同时听音乐玩游戏如何设计？
 * 进程与线程：一个程序运行至少一个进程，一个进程中至少包含一个或者多个线程；
 * 线程的调度：
 * 1.分时调度：所有线程轮流使用CPU，平均分配每个线程占用CPU的时间；
 * 2.抢占式调度：让优先级较高的线程优先使用CPU，如果优先级相同，就会随机选择一个线程【JAVA使用的是抢占式调度】
 * 对于单核CPU来说，同一时刻只能执行单个线程，CPU运行速度很快所以表面上感觉是多个程序在同时运行；
 * JAVA程序运行至少启动2个线程：一个是main线程，一个是垃圾收集线程。
 * 因为每当使用java命令执行一个类的时候，实际上都会启动一个JVM，每一个JVM实际上就是在操作系统中启动了一个进程
 */

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main方法线程I：" + i);
        }
    }
}
