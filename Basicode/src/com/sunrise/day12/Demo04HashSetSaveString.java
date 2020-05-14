package com.sunrise.day12;

import java.util.HashSet;

/**
 * set集合不允许重复原理：
 * 1.集合add方法首先会调用str1的hashCode方法，计算出哈希值(96354)，查看hs集合链表中是否有，没有插入；
 * 2.add方法调用str2的hashCode方法，发现有哈希值(96354)【哈希冲突】==》调用equals方法进行比较内容，
 *   如果比较内容返回结果true，不会将str2存入集合中；
 * 3.add方法存入"重地"hashCode值；
 * 4.add方法存入"通话"，冲突，"重地".equals"通话"返回false，存入集合中
 *
 */
public class Demo04HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        String str1 = new String("abc");
        String str2 = new String("abc");
        hs.add(str1);
        hs.add(str2);
        hs.add("重地");
        hs.add("通话");
        hs.add("abc");
        String str3 = new String("重地");
        String str4 = new String("通话");

        System.out.println(hs);
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
    }

}
