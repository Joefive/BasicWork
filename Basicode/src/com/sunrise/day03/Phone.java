package com.sunrise.day03;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String name) {
        System.out.println("给" + name + "打电话。");
    }

    public void sendMessage(String name, String message) {
        System.out.println("给" + name + "发送短信息：" + message);
    }
}
