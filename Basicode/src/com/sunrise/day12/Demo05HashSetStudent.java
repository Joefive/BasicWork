package com.sunrise.day12;

import java.util.HashSet;

/**
 * 存储自定义对象数据,必须进行重写hashCode跟equals方法；
 */
public class Demo05HashSetStudent {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张一",18);
        Student s2 = new Student("张一",18);
        Student s3 = new Student("张二",20);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);

    }
}
