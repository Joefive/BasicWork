package com.sunrise.day04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 集合中使用基本数据类型，需要使用对应的包装类
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * float    Float
 * double   Double
 * char     character
 * boolean  Boolean
 * JDK1.5以后支持了自动装箱：自动将基本类型变成了引用类型
 * 自动拆箱：从引用类型变成基本类型
 */

public class Demo06ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println(intArray);

        for (int num : intArray) {
            System.out.println(num);
        }

        /**
         * 生成6个1~33的随机数组并出入到对象集合中
         */
        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            al.add(num);
        }
        System.out.println(al);

    }
}
