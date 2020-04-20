package com.sunrise.day03;

/**
 * 对象也可以作为参数进行传递
 * 对象作为参数传递到方法中其实传递的是对象地址值
 */

public class Day0304ObjectParam {
    public static void main(String[] args) {
        Day0303Phone one = new Day0303Phone();
        one.brand = "小米";
        one.price = 2999.0;
        one.color = "银色";
        method(one);
    }

    public static void method(Day0303Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
