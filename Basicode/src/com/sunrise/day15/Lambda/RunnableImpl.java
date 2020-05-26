package com.sunrise.day15.Lambda;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建成功了！");
    }
}
