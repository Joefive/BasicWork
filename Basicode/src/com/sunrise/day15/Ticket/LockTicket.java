package com.sunrise.day15.Ticket;

/**
 * JDK1.5以后出现了lock锁
 * 主要方法是lock()开启锁；unlock()关闭锁；
 */

public class LockTicket {
    public static void main(String[] args) {
        LockImpl lt = new LockImpl();
        Thread t1 = new Thread(lt);
        Thread t2 = new Thread(lt);
        Thread t3 = new Thread(lt);
        t1.start();
        t2.start();
        t3.start();
    }
}
