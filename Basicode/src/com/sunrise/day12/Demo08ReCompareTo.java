package com.sunrise.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**Comparable与Comparator区别：
 * Comparable接口：相当于this与参数比较，需要实现Comparable接口重写compareTo方法；
 * Comparator接口：相当于找一个裁判进行比较两个人，需要实例化裁判这个对象，调用裁判的capare
 * 自己测试重写Comparator接口compare方法
 * 按照姓名跟年龄排序
 */

public class Demo08ReCompareTo {
    public static void main(String[] args) {
        ArrayList<Man> list = new ArrayList();
        Man m1 = new Man("张一", 20);
        Man m2 = new Man("李二", 18);
        Man m3 = new Man("韩三", 17);
        Man m4 = new Man("杨一", 20);
        Man m5 = new Man("王三", 20);
        System.out.println(list);
        Collections.addAll(list, m1, m2, m3, m4, m5);
        System.out.println(list);
        System.out.println("=================");

        Collections.sort(list, new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    String str1 = o1.getName().substring(0, 2);
                    String str2 = o2.getName().substring(0, 2);
                    int result1 = o1.getName().substring(0, 1).hashCode() - o2.getName().substring(0, 1).hashCode();
                    System.out.println(result1);
                    System.out.println("o1的姓名："+str1);
                    System.out.println("o2的姓名："+str2);
                    System.out.println("o1的hashcode："+str1.hashCode());
                    System.out.println("o2的hashcode："+str2.hashCode());
                    return result1;
                } else {
                    return result;
                }
            }
        });
        System.out.println(list);
    }
}
