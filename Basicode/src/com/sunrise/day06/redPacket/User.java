package com.sunrise.day06.redPacket;

/**
 * 用户类，需要被集成
 */

public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("姓名：" + name + ",账户余额:" + money + "元。");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
