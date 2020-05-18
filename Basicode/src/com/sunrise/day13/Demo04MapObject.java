package com.sunrise.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap中存储自定义对象：
 * 1.key值不能重复，所以必须要重写hashCode()方法与equals方法();
 */

public class Demo04MapObject {
    public static void main(String[] args) {
        demo01();
        show02();
    }

    /**
     * 如果使用Person对象作为key，保证不能重复
     * 所以必须重写hashCode()方法与equals方法()
     */
    private static void show02() {
        HashMap<Person, String> hm = new HashMap<>();
        hm.put(new Person("张一", 18), "北京");
        hm.put(new Person("张二", 19), "北京");
        hm.put(new Person("张三", 20), "北京");
        hm.put(new Person("张一", 18), "北京");
        System.out.println(hm);
        System.out.println("=====================");
        Set<Map.Entry<Person, String>> entries = hm.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":::" + value);
        }
    }

    private static void demo01() {
        //实例化HashMap对象泛型是<字符串，Person>对象
        HashMap<String, Person> hm = new HashMap<>();
        //实例化Person对象，其中添加一个重复
        Person p = new Person("张一", 18);
        Person p1 = new Person("张二", 19);
        Person p2 = new Person("张三", 20);
        Person p3 = new Person("张思", 18);
        hm.put("北京", p);
        hm.put("上海", p1);
        hm.put("广州", p2);
        hm.put("北京", p3);

        System.out.println(hm);
        System.out.println("=====================");

        Set<String> set = hm.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s1 = it.next();
            Person person = hm.get(s1);
            System.out.println(s1 + "===>" + person);
        }
        System.out.println("=====================");
    }
}
