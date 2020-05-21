package com.sunrise.day15;

/**
 * 匿名对象方式开启线程：
 * new 父类/接口(){
 *     重写父类、接口run方法
 * }
 */

public class Demo04InnerClassThread {
    public static void main(String[] args) {
        //匿名对象
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i+ " 匿名对象");
                }
            }
        }.start();

        //匿名接口-1:接口原来也可以被new多态
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i+" 匿名接口-1");
                }
            }
        };
        new Thread(r).start();

        //匿名接口-2
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i+" 匿名接口-2");
                }
            }
        }).start();
    }
}
