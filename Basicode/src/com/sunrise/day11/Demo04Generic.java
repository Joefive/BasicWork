package com.sunrise.day11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型：不确定类型，不知道使用什么数据类型的时候使用泛型，泛型也可以看成是一个变量，用来接收数据类型
 * 注意：1.集合创建的时候如果不带泛型，默认的是Object类型，可以存储任意类型数据
 * 好处：1.
 */

public class Demo04Generic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(666);
        list.add("中国");

        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println("=================");

        /**
         * 泛型优点：1.
         */
        Iterator it = list.iterator();



    }
}
