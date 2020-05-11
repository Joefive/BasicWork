package com.sunrise.day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator迭代器<泛型>:对集合元素进行遍历，是一个接口，无法直接使用，需要用Collection接口的iterator()方法进行实例化
 * 因为Collection集合的方法都没有索引，不能使用for循环遍历
 * 使用Iterator步骤：
 * 1.获取Iterator实例化对象，使用Iterator接口进行接收(多态);
 * 2.使用Iterator接口中的方法hasNext()方法进行判断还有没有下一个元素；
 * 3.使用Iterator中的next()方法进行取出下一个元素。
 */

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("Curry");
        c1.add("Durant");
        c1.add("James");
        c1.add("Harden");
        c1.add("Irving");
        System.out.println(c1);
        System.out.println("====================");

        //实例化迭代器Iterator
        Iterator<String> it = c1.iterator();
        //使用while循环进行迭代输出
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("====================");

        //for循环迭代输出(了解)
        for(Iterator<String> it1 = c1.iterator();it1.hasNext();){
            String e = it1.next();
            System.out.println(e);
        }

//        boolean b = it.hasNext();
//        String next = it.next();
//        System.out.println("判断集合是否为空："+b);
//        System.out.println("加上一个集合元素："+next);
//        b = it.hasNext();
//        next = it.next();
//        System.out.println("判断集合是否为空："+b);
//        System.out.println("加上一个集合元素："+next);

    }
}
