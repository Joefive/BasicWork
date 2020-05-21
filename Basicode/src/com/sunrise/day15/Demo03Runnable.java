package com.sunrise.day15;

/**
 * 多线程的第二种实现方式：创建一个线程是声明实现类Runnable接口。
 * 那个类然后实现了run方法。 然后可以分配类的实例，在创建Thread时作为参数传递，并启动。
 * 1.创建Runnable接口实现类；
 * 2.实现类重写run方法；
 * 3.实例化Runnable实现类；
 * 4.创建Thread对象，构造器传入实例化Runnable实例化对象；
 * 5.调用Thread对象start方法；
 */

public class Demo03Runnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();

    }
}
