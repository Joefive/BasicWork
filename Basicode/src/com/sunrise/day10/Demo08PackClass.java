package com.sunrise.day10;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 包装类：操作基本数据类型的类四类八种
 * Byte,Short,Integer,Float,Double,Character,Long,Boolean;
 * 装箱：1.使用构造方法；2.使用
 */
public class Demo08PackClass {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("1");
        System.out.println(in1);
        System.out.println(in2);
        System.out.println("===================");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + i * j + " ");
            }
            System.out.println();
        }

        System.out.println("====================");
        Integer in3 = Integer.valueOf("123");
        Integer in4 = Integer.valueOf(321);
        System.out.println(in3);
        System.out.println(in4);

        /**
         * 包装类自动装箱与自动拆箱
         * Integer in = 1; Integer in = new Integer(1);
         * in +1 ; in.intValue()+2;
         */
        Integer in5 = 10;
        in5 = in5 + 2;
        int in6 = in5 + 2;
        System.out.println("in5" + in5);
        ArrayList<Integer> list = new ArrayList<>();
        //这里隐含了自动装箱，arrayList只能存储Integer不能存储int类型
        list.add(1);
        int in7 = list.get(0); //自动拆箱

    }
}
