package com.sunrise.day04;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("[1]生成随机数字：" + num);

        //左闭右开，[0,3)标识从0~2的数字，不包含3，类似数组下标
        int num2 = r.nextInt(3);
        System.out.println("[2]生成随机数字：" + num2);

        for (int i = 0; i < 20; i++) {
            int num3 = r.nextInt(10);
            System.out.println(num3);
        }
        System.out.println("===================");

        numRandom(10, 10);
        System.out.println(num2Random(10));
    }

    /**
     * 随机生成n个1到n的数字
     */
    public static void numRandom(int l, int m) {
        Random r = new Random();
        for (int i = 0; i < l; i++) {
            int num = r.nextInt(m) + 1;
            System.out.println(num);
        }
    }

    /**
     * 生成n个10以内的随机数字
     */
    public static String num2Random(int l) {
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < l; i++) {
            rs.append(r.nextInt(10)+" ");
        }
        return rs.toString();
    }
}