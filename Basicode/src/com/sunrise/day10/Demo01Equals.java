package com.sunrise.day10;

/**
 * equals方法：对于基本类型比较的是数值，如果是引用那类型比较对象的地址
 */
public class Demo01Equals {
    public static void main(String[] args) {
        Person p = new Person("张一", 19);
        Person p1 = new Person("张二", 20);
        boolean b = p.equals(p1);
        System.out.println("【1】p比对p1：" + b);
        p = p1;
        boolean d = p.equals(p1);
        System.out.println("【2】p比对p1：" + d);

    }
}
