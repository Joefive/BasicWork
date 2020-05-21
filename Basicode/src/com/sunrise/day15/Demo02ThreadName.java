package com.sunrise.day15;

/**
 * 常用方法：
 * 1.getName()方法，可以获取线程名称；也可以使用Thread.currentThread获取线程名称；
 * 2.setName()方法，设置线程名称；可以使用带参数的构造器；
 * 3.sleep(long millis)让线程暂停，以指定的毫秒级别 1000毫秒=1秒
 */
public class Demo02ThreadName {
    public static void main(String[] args) {
        ThreadName tn = new ThreadName();
        tn.start();
        System.out.println("===========");
        ThreadName tn1 = new ThreadName("variableThreadName1");
        tn1.start();
        System.out.println("===========");
        String threadName = ThreadName.currentThread().getName();
        System.out.println("main主线程名称：" + threadName);
        System.out.println("===========");
        ThreadName tn2 = new ThreadName();
        tn2.setName("myThread");
        tn2.start();
        System.out.println("===========");
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
