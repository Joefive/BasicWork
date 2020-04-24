package com.sunrise.day04;

import java.util.ArrayList;
import java.util.Random;
import com.sunrise.util.Util;

/**
 * 集合中使用基本数据类型，需要使用对应的包装类
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * float    Float
 * double   Double
 * char     character
 * boolean  Boolean
 * JDK1.5以后支持了自动装箱：自动将基本类型变成了引用类型
 * 自动拆箱：从引用类型变成基本类型
 */

public class Demo06ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println(intArray);

        for (int num : intArray) {
            System.out.println(num);
        }

        /**
         * 生成6个1~33的随机数组并出入到对象集合中
         */
        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            al.add(num);
        }
        System.out.println(al);

        /**
         * 创建一个集合，里面放入4个不同的对象，并且打印遍历出
         */
        ArrayList<Person> pe = new ArrayList<>();
        Person one = new Person("王一", 20);
        Person two = new Person("王二", 21);
        Person three = new Person("王三", 22);
        Person four = new Person("王四", 23);
        pe.add(one);
        pe.add(two);
        pe.add(three);
        pe.add(four);
        for (int i = 0; i < pe.size(); i++) {
            Person person = pe.get(i);
            System.out.println("我的名字叫："+person.getName()+",今年："+person.getAge()+"岁。");
        }

        //调用打印方法进行打印字符串集合
        Util ut = new Util();
        ArrayList<String> str = new ArrayList<>();
        str.add("一号");
        str.add("二号");
        str.add("三号");
        ut.printArrayList(str);

    }
}
