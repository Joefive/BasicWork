package com.sunrise.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList实现的是List接口
 */

public class Demo06Interface {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        //直接使用多态匿名对象方式，因为ArrayList实际是实现了List
        List<String> list2 = new ArrayList<>();
        List<String> result = addName(list2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addName(List list) {
        list.add("张一");
        list.add("张二");
        list.add("张三");
        return list;
    }
}
