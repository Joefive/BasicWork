package com.sunrise.day15.Lambda;

public class Demo03Cook {
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("回家吃饭了！");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
