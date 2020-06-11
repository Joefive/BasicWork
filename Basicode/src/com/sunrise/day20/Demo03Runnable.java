package com.sunrise.day20;

public class Demo03Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "=======" + "线程启动");
            }
        });
        //使用lambda
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "=======" + "线程启动");
        });
        //优化lambda
        startThread(() -> System.out.println(Thread.currentThread().getName() + "=======" + "线程启动"));
    }

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }
}
