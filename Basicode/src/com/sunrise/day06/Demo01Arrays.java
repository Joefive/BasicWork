package com.sunrise.day06;

import com.sunrise.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * toString()将数组转化成字符串形式
 * sort()方法：1.进行排序，数组从小到大，字母按照首字母a~z
 * 注意：如果是自定义类，那么自定义类必须实现Comparable接口、Comparator接口的支持。
 */

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {5, 9, 3, 4, 1};
        String strArray = Arrays.toString(intArray);
        System.out.println(strArray);

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] oneArray = {"da", "aeef", "caaae", "bzzz"};
        Arrays.sort(oneArray);
        System.out.println(Arrays.toString(oneArray));

        //练习：生成一个随机字符串进行升序排列，进行倒序打印
        Random r = new Random();
        int[] arrA = new int[10];
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = r.nextInt(31);
        }
        String str1 = Arrays.toString(arrA);
        Arrays.sort(arrA);
        System.out.println(str1);
        System.out.print("[");
        for (int i = arrA.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrA[i] + "]");
            } else {
                System.out.print(arrA[i] + ", ");
            }
        }
        System.out.println("======================");

        ArrayList<Integer> chars = new ArrayList<>();
        Random r1 = new Random();
        for (int i = 0; i < 10; i++) {
            chars.add(r1.nextInt(11));
        }
        System.out.println(chars);
        Collections.sort(chars);    //arraysList的排序可以使用Collections对应sort方法
        System.out.println(chars);
        System.out.println("======================");
        Util.resverArrayList(chars);
    }
}
