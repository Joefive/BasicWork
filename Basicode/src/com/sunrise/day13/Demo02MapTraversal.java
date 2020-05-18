package com.sunrise.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历：
 * 1.keySet()方法：取出Map集合中所有的key值，放入set集合中；使用get方法获取set中的key值，输入出对应value值；
 * 2.
 */

public class Demo02MapTraversal {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张学友");
        map.put(2, "刘德华");
        map.put(3, "郭富城");
        map.put(4, "黎明");
        Set<Integer> set1 = map.keySet();
        //使用迭代器
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            String s = map.get(next);
            System.out.println(next + "-" + s);
        }
        System.out.println("=================");
        //使用增强for
        for (Integer integer : map.keySet()) {
            String s1 = map.get(integer);
            System.out.println(integer + "-" + s1);
        }
        System.out.println("=================");

    }
}
