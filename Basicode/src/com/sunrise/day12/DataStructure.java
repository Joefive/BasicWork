package com.sunrise.day12;

import java.util.Arrays;

/**
 * 数据结构：栈、队列、数组、链表、红黑树；
 * 栈Stack:入口出口只有一个，先进后出；类似于子弹夹；
 * 队列：先进先出，入口与出口在集合的两侧；
 * 数组：查询快，增删慢；数组创建后长度固定，查询根据索引比较快；增加或者删除一个元素需要在堆内存中从新创建数组，所以增删慢；
 * 链表：查询慢，增删快；一个链表在内存中分了三块：||链表地址||数据||下一个节点地址||
 *      1.单向链表：一条链子不能保证存储元素的顺序；
 *      2.双向链表:链表中两条链子，一条链子可以记录元素顺序，是个有序的集合；
 * 红黑树：
 */

public class DataStructure {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3};
        int[] num2 = num.clone();
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
    }
}
