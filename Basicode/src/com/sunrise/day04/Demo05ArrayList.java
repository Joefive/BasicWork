package com.sunrise.day04;

import java.util.ArrayList;

/**
 * 普通的数组对象：数组中不仅可以放基础元素，还可以放入对象
 * 缺点：数组对象一旦创建，长度不可改变
 * 引出了ArrayList<E>，数组集合
 * 数组集合中<E>代表泛型:泛型必须是引用类型，不能是基本类型，如果使用基本类型需要需要对基本类型封装
 * 泛型：装在集合中所有元素，全都是统一的某种类型
 */

public class Demo05ArrayList {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person one = new Person("张一", 18);
        Person two = new Person("张二", 19);
        Person three = new Person("张三", 20);
        arr[0] = one;
        arr[1] = two;
        arr[2] = three;
        System.out.println(arr[1]);
        System.out.println(arr[1].getName());

        /**数组集合元素
         *JDK1.7以后可以省略后面<>中的String
         * 添加方法：add()方法，对与Arraylist进行add一定会成功，但是其他类型集合不一定成功
         * 获取方法：get()方法
         * 删除方法: remove()方法
         * 获取长度：size()方法
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("刘一");
        list.add("刘二");
        list.add("刘三");
        System.out.println(list);
        //list.clear();
        String str = list.get(0);
        int num = list.size();
        System.out.println("数组集合长度:" + num);
        System.out.println("数组集合0号元素：" + str);
        String removeList = list.remove(1);
        System.out.println("删除的数组元素:" + removeList);
        System.out.println(list);

        //数组集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
