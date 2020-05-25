package com.sunrise.day15.Ticket;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 线程安全问题：同步代码块，使用synchronized关键字对线程加锁，保证只有一个线程在同步代码块中执行。
 * 注意：1.锁对象可以是任意类型；2.必须要保证多个线程使用的是同一个锁对象；
 * 同步代码块中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步程序内；
 * 缺点：频繁切换锁，效率比较低。
 */

public class RunnableImpl implements Runnable {
    //private int ticket = 100;
    private static int ticket = 100;

    //Object obj = new Object();
    @Override
    public void run() {
        while (ticket>0){
            System.out.println("this::=" + this);
            //payTicked();
            staticPayTicked();
        }
/*        synchronized (obj){
            while (true) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "线程正在出售" + ticket + "号票！");
                    ticket--;
                }
            }
        }*/
    }

    /**
     * 第二种同步方法：使用同步方法，格式：修饰符 synchronized 返回值类型 方法名(参数名){}
     * 同步代码块的锁对象就是this
     */
    public synchronized void payTicked() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售车票：" + ticket);
            ticket--;
            System.out.println("ticked:" + ticket);
        }
    }

    /**
     * 静态的同步代码方法：静态同步方法的对象是本类(RunnableImpl.class)
     */
    public static synchronized void staticPayTicked(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售车票：" + ticket);
            ticket--;
            System.out.println("ticked:" + ticket);
        }
    }
}
