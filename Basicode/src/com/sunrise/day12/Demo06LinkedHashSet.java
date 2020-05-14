package com.sunrise.day12;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet底层是哈希表(数组+链表/红黑树)+链表，多了一条链表来记录顺序，保证元素有序
 * 特点：1.有顺序的，存储的顺序等于取出的顺序；2.不允许重复值；
 */

public class Demo06LinkedHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("www");
        hs.add("abc");
        hs.add("abc");
        hs.add("com");
        System.out.println(hs);
        System.out.println("================");

        LinkedHashSet lk = new LinkedHashSet();
        lk.add("www");
        lk.add("abc");
        lk.add("abc");
        lk.add("com");
        System.out.println(lk);
    }
}
