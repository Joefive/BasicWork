package com.sunrise.day01;

public class Demo05Method {
    public static void main(String[] args) {
        farmer();
        man("张三");
        man("李四");
    }

    public static void farmer() {
        System.out.println("种地");
    }

    public static void man(String name) {
        System.out.println(name);
    }
}
