package com.sunrise.day12;

import java.util.LinkedList;

/**
 * LinkedList集合实现了List接口【多线程】
 * 特点：1.底层是一个双向链表，查询慢，增删快；
 *      2.包含大量操作首尾的方法；
 *      3.不能使用多态。
 * 方法：1.添加addFirst方法与push方法等效；
 *      2.获取方法getFirst,getLast方法；
 *      3.删除方法removeFirst与pop相同。
 */

public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ld = new LinkedList<>();
        ld.add("a");
        ld.add("b");
        ld.add("c");
        demo01(ld, "QQ");
        ld.push("www");
        ld.addLast("com");
        String first = ld.getFirst();
        String last = ld.getLast();
        System.out.println(ld);
        System.out.println("ld.first:" + first);
        System.out.println("ld.last:" + last);
        System.out.println("=================");
        demo02();
    }

    /**
     * 封装链表添加头部元素方法
     *
     * @param linkedList
     * @param str
     */
    private static void demo01(LinkedList linkedList, String str) {
        linkedList.addFirst(str);
    }

    private static void demo02() {
        LinkedList<Object> li = new LinkedList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        System.out.println(li);
        //li.remove(1);
        //li.removeFirst();
        //li.removeLast();
        li.pop();
        System.out.println(li);
    }

}
