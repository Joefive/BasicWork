package com.sunrise.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections方法介绍：
 * 1.addAll()方法，一次添加多个元素；
 * 2.sort()方法，可以对集合排序；注意：sor方法必须实现Comparable接口
 * 3.sort()方法，Comparator排序规则，o1-o2等于升序、o2-o1等于降序；
 */

public class Demo07Collections {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=================");

        ArrayList<Person> list02 = new ArrayList<>();
        Person p1 = new Person("张三", 22);
        Person p2 = new Person("张二", 21);
        Person p3 = new Person("张一", 20);
        Collections.addAll(list02, p1, p2, p3);
        System.out.println(list02);
        Collections.sort(list02);
        System.out.println(list02);
        System.out.println("=================");

        ArrayList<Integer> list03 = new ArrayList<>();
        Collections.addAll(list03, 9, 2, 1, 3, 5);
        System.out.println(list03);
        Collections.sort(list03, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2; //升序
                return o2 - o1; //降序
            }
        });
        System.out.println(list03);
        System.out.println("=================");



    }
}
