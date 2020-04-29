package com.sunrise.day06.redPacket;

import java.util.ArrayList;
import java.util.Random;

/**
 * 测试ArrayList，从ArrayList中remove掉一个元素后查看当前ArrayList的长度与数值
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(11);
        ai.add(22);
        ai.add(33);
        ai.add(44);
        for (int num : ai) {
            System.out.print(num + "【1】");
        }
        System.out.println("==============");

        int count = ai.size();
        System.out.println("ai.size=" + count);
        int index = new Random().nextInt(ai.size());
        System.out.println("index=" + index);
        int num = ai.remove(index);
        System.out.println("num=" + num);

        for (int num1 : ai) {
            System.out.print(num1 + "【2】");
        }
        System.out.println("==============");

        int count2 = ai.size();
        System.out.println("ai.size=" + count2);
        int index2 = new Random().nextInt(ai.size());
        System.out.println("index2=" + index2);
        int num2 = ai.remove(index2);
        System.out.println("num2=" + num2);

        for (int num3 : ai) {
            System.out.print(num3 + "【3】");
        }
        System.out.println("==============");

        int count3 = ai.size();
        System.out.println("ai.size=" + count3);
        int index3 = new Random().nextInt(ai.size());
        System.out.println("index3=" + index3);
        int num3 = ai.remove(index3);
        System.out.println("num3=" + num3);

        for (int num4 : ai) {
            System.out.print(num4 + "【4】");
        }
        System.out.println("==============");


    }
}
