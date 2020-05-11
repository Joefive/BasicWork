package com.sunrise.day11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环：底层也是使用的迭代器，使用的for循环的格式，简化了迭代器的书写
 * 格式：for(数组/集合名称 变量名 ： 数组/集合名称){ system.out(变量名)}
 */

public class Demo03ForEach {
    public static void main(String[] args) {
        Collection<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        for (int num : in)
            System.out.println(num);
        System.out.println("===================");

        int[] arr = {11, 22, 33, 44, 55};
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("===================");

        demo01();
        System.out.println("===================");
    }

    private static void demo01() {
        ArrayList<String> st = new ArrayList<>();
        st.add("张一");
        st.add("张二");
        st.add("张三");
        for(String sr :st){
            System.out.println(sr);
        }
    }
}
