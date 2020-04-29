package com.sunrise.day06.redPacket;

import java.util.ArrayList;
import java.util.Random;

public class Worker extends User {
    public Worker() {

    }

    public Worker(String name, int money) {
        super(name, money);
    }

    /**
     * 抽取红包方法：从刚才分好的红包集合中随机抽取一个
     * 1.获取集合索引；
     * 2.删除一个集合，并将删除集合金额发给自己；
     * 3.获取金额返回给余额；
     */
    public void receive(ArrayList<Integer> list) {
        //获取一个随机集合下标
        int index = new Random().nextInt(list.size());
        //remove()方法可以删除掉当前ArrayList中的元素，并返回当前删除的数值，获取金额
        int delta = list.remove(index);
        //获取当前账户金额
        int money = super.getMoney();
        //将获取金额与当前金额求和并重新赋值
        super.setMoney(delta + money);
    }

}
