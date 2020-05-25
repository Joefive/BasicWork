package com.sunrise.day15.Ticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1.成员类中创建lock接口实现类ReentrantLock对象；
 * 2.在可能出现线程问题的代码前调用lock()方法；
 * 3.在可能出现线程问题的代码后调用unlock()方法；
 */

public class LockImpl implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (ticket > 0) {
            System.out.println("ticket:" + ticket);
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票！");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }

    }
}
