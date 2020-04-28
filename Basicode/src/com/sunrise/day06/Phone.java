package com.sunrise.day06;

public class Phone {
    String name = "韩蛋";

    public Phone() {
        System.out.println("1.父类构造方法Phone()");
    }

    public Phone(int num) {
        System.out.println("1-2.父类重载的构造方法Phone()" + num);
    }

    public void call() {
        System.out.println("打电话！");
    }

    public void sendMessage() {
        System.out.println("发短信！");
    }

    public void showNumber() {
        System.out.println("来电显示号码！");
    }
}
