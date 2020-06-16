package com.sunrise.day21.MethodReference;

/**
 * 实体类，需要被引用的类，需要引用其中转化方法printUpperCase()
 */
public class Demo02ClassObjectReference {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}
