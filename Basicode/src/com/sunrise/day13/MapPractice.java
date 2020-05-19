package com.sunrise.day13;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 输入一个字符串，判断每次字符出现了几次，将结果存放在Map中
 * 1.获取Scanner，获取输入字符串；
 * 2.遍历字符串使用toCharArray()方法组成字符数组进行遍历；
 * 3.在map中使用containsKey()方法判断key中是否包含字符
 * JDK9中List&Set新特性，可以使用of方法来添加集合元素：list.of("a","a","b","c") set.of("a","b","c")
 */

public class MapPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (hm.containsKey(c)) {
                Integer val = hm.get(c);
                val++;
                hm.put(c, val);
            } else {
                hm.put(c, 1);
            }
        }
        Set<Character> ct = hm.keySet();
        for (Character character : ct) {
            Integer integer = hm.get(character);
            System.out.println(character+":"+integer);
        }
        System.out.println("===================");
        System.out.println(hm);

    }
}
