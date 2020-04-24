package com.sunrise.day04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成20个随机数字，并且筛选出放入集合中
 */

public class Demo07ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        System.out.println(bigList);
        System.out.println(checkArrayList(bigList));
    }

    //封装筛选函数
    public static ArrayList<Integer> checkArrayList(ArrayList<Integer> bigList){
        ArrayList<Integer> littleList = new ArrayList<>();
        for (int j = 0; j < bigList.size(); j++) {
            Integer num = bigList.get(j);
            if (num % 2 == 0) {
                littleList.add(num);
            } else {
                continue;
            }
        }
        return littleList;
    }
}
