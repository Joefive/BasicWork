package com.sunrise.day15;

/**
 * 1.创建一个Thread类的子类；
 * 2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?),做什么写在run方法内；
 * 3.创建Thread类的子类对象；
 * 4.调用Thread类中的方法start方法,开启新的线程,执行run方法；
 * void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 * 结果是两个线程并发地运行；当前线程（main线程）和另一个线程（创建的新线程,执行其 run 方法）。
 * 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
 * getName()可以获取当前线程名称；
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread线程中I:" + i);
        }
    }
}
