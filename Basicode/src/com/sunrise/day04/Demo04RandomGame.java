package com.sunrise.day04;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int numRandom = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        //在不知道循环多少次的情况下使用while循环
//        while (true) {
//            int inputRandom = sc.nextInt();
//            if (inputRandom > numRandom) {
//                System.out.println("输入的数字：" + inputRandom + "太大了！");
//            } else if (inputRandom < numRandom) {
//                System.out.println("输入的数字：" + inputRandom + "太小了！");
//            } else {
//                System.out.println("输入正确，答案是：" + inputRandom);
//                break;
//            }
//        }
        //使用for循环进行规定输入次数为6次
        for (int i = 0; i < 6; i++) {
            int inputRandom = sc.nextInt();
            if (inputRandom > numRandom) {
                System.out.println("输入的数字：" + inputRandom + "太大了！");
            } else if (inputRandom < numRandom) {
                System.out.println("输入的数字：" + inputRandom + "太小了！");
            } else {
                System.out.println("输入正确，答案是：" + inputRandom);
                break;
            }
        }
        System.out.println("游戏结束！");
    }

}
