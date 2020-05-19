package com.sunrise.day13;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 *  LinkedHashMap：继承了HashMap接口，实现了Map接口，底层是哈希表加链表，链表保证集合有序；
 *  特点：1.key不允许重复；2.读取顺序一致，存入顺序与拿出顺序保持一致；
 *  HashTable，是JDK1.1之前的双列集合，那时候没有HashMap；是单线程，线程安全但是速度慢，无顺序；
 *  在JDK1.2之后HashTable被HashMap取代，Vector被ArrayList取代；
 *  但是HashTable子类properties集合是一个唯一与IO流结合的集合。
 */

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lk = new LinkedHashMap<>();
        lk.put(1,"张一");
        lk.put(3,"张三");
        lk.put(1,"张思");
        lk.put(2,"张二");
        System.out.println(lk);
        System.out.println("=================");

        HashMap<String,String> hm = new HashMap<>();
        hm.put(null,"a");
        hm.put("b",null);
        hm.put(null,null);
        System.out.println(hm);
        System.out.println("=================");

        Hashtable<String,String> ht = new Hashtable<>();
        ht.put("a","a");
        ht.put("b","b");
        //ht.put(null,null); //不允许使用null空指针异常
        System.out.println(ht);

    }
}
