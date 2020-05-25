package com.sunrise.day15.waitNotify;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if(bz.getFlag()==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //吃货正在吃包子
                System.out.println("吃货正在吃"+bz.getPi()+bz.getXian()+"的包子！");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(false);
                bz.notify();
                System.out.println("吃货已经吃完了"+bz.getPi()+bz.getXian()+"的包子，唤醒包子铺线程！");
                System.out.println("===================");
            }
        }
    }
}
