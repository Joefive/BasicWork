package com.sunrise.day04;

import java.util.ArrayList;

/**
 * 普通的数组对象：数组中不仅可以放基础元素，还可以放入对象
 * 缺点：数组对象一旦创建，长度不可改变
 * 引出了ArrayList<E>，数组集合
 * 数组结合中<E>代表泛型
 * 泛型：装在集合中所有元素，全都是统一的某种类型
 */

public class Demo05ArrayObject {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person one = new Person("张一",18);
        Person two = new Person("张二",19);
        Person three = new Person("张三",20);
        arr[0]=one;
        arr[1]=two;
        arr[2]=three;
        System.out.println(arr[1]);
        System.out.println(arr[1].getName());

        //数组集合元素
        //JDK1.7以后可以省略后面<>中的String
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("刘一");
        list.add("刘二");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

}
