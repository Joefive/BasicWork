package com.sunrise.day09.packFive;

import com.sunrise.day09.packFive.red.OpenMode;

/**
 * 发红包案例
 */

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("老地主发红包");
        red.setOwnerName("老地主");
        //普通平均红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        //随机红包
        OpenMode ran = new RandomMode();
        red.setOpenWay(ran);
    }
}
