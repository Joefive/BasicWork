package com.sunrise.day15.waitNotify;


public class WaitNotify {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu  bzp = new BaoZiPu(bz);
        ChiHuo ch = new ChiHuo(bz);
        bzp.start();
        ch.start();
    }
}
