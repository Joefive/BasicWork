package com.sunrise.day06.redPacket;

import java.util.ArrayList;

public class Boss extends User {
    public Boss() {
    }

    public Boss(String name, int money) {
        super(name, money);
    }

    /**
     * 1.发红包方法，需要先newArraylis存储发的份数与金额；
     * 2.查看余额；设置余额，扣钱；
     * 3.根据传入参数(金额、份数)计算出没个红包的金额；
     * 4.计算方法，如果除不尽，取模放入最后一个红包中。
     *
     * @param totalMoney
     * @param count
     * @return
     */
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        //查看余额是否够发红包
        int lastMoney = super.getMoney();
        if (lastMoney < totalMoney) {
            System.out.println("当前余额:" + lastMoney + "元,发送金额：" + totalMoney + "元，当前账户余额不足，请充值！");
            return redList;
        }
        //先设置当前账户余额
        super.setMoney(lastMoney - totalMoney);
        //计算平均红包金额
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        //最后一个红包加入零头
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                int last = avg + mod;
                redList.add(last);
            } else {
                redList.add(avg);
            }
        }
        return redList;
    }
}
