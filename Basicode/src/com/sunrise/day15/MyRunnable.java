package com.sunrise.day15;

/**
 * Runnable与Thread的区别：
 * 1.解决了Java的单继承性，如果一个类继承了别的类就无法继承Thread类了，可以采用实现Runnable接口方式来实现；
 * 2.解耦，增强了程序的扩展性；实现类重写了run方法，但是必须要创建Thread对象才能开启新线程；
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("Runnable子类线程名称：" + name + " " + i);
        }
    }
}
