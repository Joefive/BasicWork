package com.sunrise.day13;

import java.util.HashMap;
import java.util.Map;

/**
 * Map接口：public interface Map<K V>，键值对，key，value，不能有重复的key，每个key包含一个值。
 * Collection是单列接口(单身)，Map是双列集合(夫妻)
 * Map的特点：
 * 1.Map集合元素中key、value的数据类型可以相同，也可以不同；2.Map集合中key不能重复，value值可以重复；
 * 哈希表：数组&链表||红黑树，长度超过8个链表就会使用红黑树；
 * Map常用的子类：
 * 1.HashMap集合，底层是哈希表查询快；JDK1.8之前，数组+单向链表；之后数组+单向链表(红黑树)2.是无序集合；
 * 2.LinkedHashMap集合：1.继承了HashMap接口实现了Map接口；2.底层是哈希表+链表；3.是个有序集合；
 * Map:常用方法：
 * 1.put方法：V put(K key,V value) ：如果key值不重复返回null，如果key值重复了返回新的value值；可以不允许重复！
 * 2.remove方法：key存在返回被删除的value值，如果key不存在返回null;
 * 3.get方法：通过key来获取value，如果key存在返回对应value值，如果key不存在返回null；
 * 4.containsKey方法：判断集合中是否包含制定的key，如果包含返回true，如果不包含返回false。
 */

public class Demo01Map {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "James");
        m1.put(2, "Curry");
        m1.put(3, "Durant");
        m1.put(4, "Irving");
        m1.put(5, "Harden");
        String r1 = m1.remove(1);
        String r2 = m1.remove(1);
        System.out.println("r1:" + r1);
        System.out.println("r1:" + r2);
        System.out.println(m1);
        System.out.println("================");
        String s = m1.get(1);
        String s1 = m1.get(2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println("================");
        boolean b = m1.containsKey(1);
        boolean b1 = m1.containsKey(2);
        System.out.println(b);
        System.out.println(b1);
        System.out.println("================");
    }

    private static void demo01() {
        Map<String, String> map = new HashMap<>();
        String s1 = map.put("01", "张一");
        String s2 = map.put("01", "张二");
        map.put("02", "张二");
        map.put("03", "张三");
        map.put("04", "张四");
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(map);
        System.out.println("================");
    }


}
