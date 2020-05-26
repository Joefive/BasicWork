package com.sunrise.day15.ThreadPool;

public class RnnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建新线程!");
    }
}
