package com.sunrise.day11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型：不确定类型，不知道使用什么数据类型的时候使用泛型，泛型也可以看成是一个变量，用来接收数据类型
 * 注意：1.集合创建的时候如果不带泛型，默认的是Object类型，可以存储任意类型数据
 * 优点：1.可以避免数据转换的麻烦，存储什么类型就取出什么类型；
 * 2.把运行期异常(运行后跑出异常)提升到了编译期异常(编写代码时)，方便查错；
 * 缺点：1.泛型什么类型只能存什么类型；
 */

public class Demo04Generic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(666);
        list.add("中国");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("=================");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            //如果需要使用String类的特有方法，length()获取字符串长度，但是多态不支持子类特有方法
            //需要向下转型
            /*String str1 = (String) obj;
            int length = str1.length();
            System.out.println("str1的长度：" + length);*/
        }
        System.out.println("=================");

        ArrayList<String> sList = new ArrayList<>();
        sList.add("厄立特里亚");
        sList.add("纳米比亚");
        for (String str : sList) {
            System.out.println(str + "==>" + str.length());
        }
    }
}
