package com.sunrise.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Entry对象遍历方法：Entry是Map接口中的内部静态接口，相当于Map的一个映射，相当于两个人的结婚证上有两个人的名字
 * 1.首先调用entrySet()方法，把Map中的Entry对象取出存入Set集合中；
 * 2.遍历Entry对象；
 * 3.使用entrySet()方法中的getKey()与getValue()方法获取对应key、value值。
 */

public class Demo03MapEntry {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "张一");
        map.put("02", "张二");
        map.put("03", "张三");
        map.put("04", "张四");

        Set<Map.Entry<String, String>> entry = map.entrySet();
        //迭代器遍历entry对象
        Iterator<Map.Entry<String, String>> it = entry.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.println("========================");
        //增强for循环遍历entry对象
        for (Map.Entry<String, String> se : entry) {
            String key1 = se.getKey();
            String value1 = se.getValue();
            System.out.println(key1 + ":" + value1);
        }
    }
}
