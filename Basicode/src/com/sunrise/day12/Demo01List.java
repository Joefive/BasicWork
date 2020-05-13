package com.sunrise.day12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * list接口继承collection【多线程】
 * 特点：1.有顺序的集合，存放和取出的顺序一致；
 *      2.有索引，包含带索引的方法；
 *      3.允许出现重复元素。
 */
public class Demo01List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add(3,"QQ");
        list.remove(4);
        String a = list.set(4, "A");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("==============");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("==============");

        for (String s : list) {
            System.out.println(s);
        }

    }


}
