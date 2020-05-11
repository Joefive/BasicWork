package com.sunrise.day11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 学习集合目标：
 * 1.使用集合存储数据；
 * 2.会遍历集合里面的元素；
 * 3.掌握每种集合的特性;
 * 集合概述：
 *                         一.List(接口)：1.Vector;2.ArrayList;3.LinkedList;
 *                         特点：1.集合中元素有顺序；2.允许有重复元素；3.有索引可以用for循环遍历；
 * collection<泛型>(接口) ==>继承
 *                         二.Set(接口)：1.TreeSet;2.HashSet;3.LinkedHashSet;
 *                         特点：1.不允许重复元素；2.没有索引，不能使用for循环遍历；3.TreeSet,HashSet无序集合;
 * collection特点：1.定义以上两种单列集合的共性方法;2.没有带索引的方法。
 * collection常用方法：
 * (返回boolean值都可以省略)1.add返回boolean值;2.reMove方法删除具体元素;3.contains检测是否包含元素;4.isEmpty是否空;
 * 5.size()方法返回集合长度；5.toArray()方法把集合元素存储到数组中。6.clear()清空集合中元素，不删除集合；
 */

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        boolean b = c1.add("中国");
        c1.add("美国");
        c1.add("英国");
        System.out.println(b);
        System.out.println("集合c1:" + c1); //打印不是地址值，重写了toString方法；
        System.out.println("===================");

        boolean b1 = c1.remove("美国");
        System.out.println(b1);
        System.out.println("集合c1删除:" + c1);
        System.out.println("===================");

        boolean contains = c1.contains("中国");
        System.out.println("contains：" + contains);
        System.out.println("===================");

        boolean empty = c1.isEmpty();
        System.out.println("empty：" + empty);
        System.out.println("===================");

        int size = c1.size();
        System.out.println("size：" + size);
        System.out.println("===================");

        Object[] arr = c1.toArray(); //Object[]类型数组可以存储任意类型元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===================");

        c1.clear();
        System.out.println("clear方法后c1："+ c1);
    }
}
