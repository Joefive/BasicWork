package com.sunrise.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set接口特点：1.不允许重复元素；2.没有索引；
 * HashSet集合：实现了Set接口，1.是个无序的集合，存入取出的顺序不一致；2.底层是HashMap
 * HashCode：哈希值是一个十进制的整数，有系统随机指出，是对象的地址值，是逻辑地址模拟出来的地址，不是物理地址；
 * Object中public int hashCode()，返回哈希码值；
 * public native int hashCode(); native代表调用本地操作系统方法
 * Integer对象返回的哈希散列码：public static int hashCode(int value) { return value;}
 * Boolean布尔值返回哈希散列码：public static int hashCode(boolean value) {return value ? 1231 : 1237;}
 * String引用类型的哈希散列码：
 *         public int hashCode() {
 *         int h = hash;
 *         if (h == 0 && value.length > 0) {
 *             char val[] = value;
 *             for (int i = 0; i < value.length; i++) {
 *                 h = 31 * h + val[i];
 *             } hash = h;
 *         } return h;
 *     }
 */
public class Demo03Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
            System.out.println("hashCode = "+next.hashCode());
        }
        System.out.println("================");

        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("================");

        Person p = new Person();
        Person p1 = new Person();
        int i = p.hashCode();
        int i1 = p1.hashCode();

        System.out.println(p);
        System.out.println(p1);
        System.out.println(i);
        System.out.println(i1);
        System.out.println("================");

        String s1 = "abc";
        int ascii = Integer.valueOf('a');
        System.out.println("ascii码值："+ascii);
        System.out.println((int)'a');
        System.out.println((int)'b');
        System.out.println((int)'c');
        String s2 = "123";
        int i2 = s1.hashCode();
        int i3 = s2.hashCode();
        System.out.println(s1.hashCode());
        System.out.println("=====*****=====");
        System.out.println(i3);
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        Integer num = 123;
        System.out.println(num.hashCode()); //
        System.out.println("****************");
        Boolean bb = true;
        System.out.println(bb.hashCode());
        Boolean ff = false;
        System.out.println(ff.hashCode());
    }
}
