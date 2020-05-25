package com.sunrise.day15.waitNotify;

/**
 * 包子铺和吃货两个线程是互斥关系；
 */

public class BaoZiPu extends Thread {
    //1.定义一个包子变量，包子对象是变量类型
    private BaoZi bz;

    //2.创建包子铺构造器可以传入包子对象
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //3.生产包子,当包子状态为true线程暂停唤醒吃货
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if ( bz.getFlag()==true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //区分包子种类%2进行区分包子种类
                if (count % 2 == 0) {
                    bz.setPi("薄皮");
                    bz.setXian("青菜蘑菇");
                } else {
                    bz.setPi("厚皮");
                    bz.setXian("孜然牛肉");
                }
                count++;
                System.out.println("包子铺做好了" + bz.getPi() + bz.getXian() + "的包子！");
                //唤醒吃货线程
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(true);
                bz.notify();
                System.out.println("包子铺已经蒸出了" + bz.getPi() + bz.getXian() + "的包子，唤醒吃货线程！！！");

            }

        }

    }
}
