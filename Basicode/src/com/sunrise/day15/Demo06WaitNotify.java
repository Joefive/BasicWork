package com.sunrise.day15;

/**
 * notify()唤醒后的线程需要继续执行wait()后的代码
 */

public class Demo06WaitNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        //创建一个顾客的线程
        new Thread() {
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客：老板来大碗胡辣汤两个馍...辣子多！");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //notify唤醒之后执行
                        System.out.println("顾客：今儿个汤味不错，香滴很！");
                        System.out.println("===========================");
                    }
                }

            }
        }.start();

        //创建一个老板的线程
        new Thread() {
            public void run() {
                while (true) {
                    //花费5秒来做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板：大碗两个馍10块，端好碗！");
                        obj.notify();
                    }
                }
            }

        }.start();

    }
}
