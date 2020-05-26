package com.sunrise.day15.Lambda;

public class Demo01RunnableSub {
    public static void main(String[] args) {
        RunnableImpl ri = new RunnableImpl();
        Thread t = new Thread(ri);
        t.start();
        //匿名内部类1
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "匿名内部类【1】！");
            }
        };
        new Thread(r).start();
        //匿名内部类2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "匿名内部类【2】！");
            }
        }).start();

    }
}
