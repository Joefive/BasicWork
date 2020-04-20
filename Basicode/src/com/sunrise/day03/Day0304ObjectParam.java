package com.sunrise.day03;

/**
 * 1.对象也可以作为参数进行传递
 * 对象作为参数传递到方法中其实传递的是对象地址值
 * 2.对象也可以作为返回值
 * return返回值类型是当前对象地址值
 */

public class Day0304ObjectParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "小米";
        one.price = 2999.0;
        one.color = "银色";
        method(one);

        Phone three = getPhone();
        System.out.println(three);
        System.out.println(three.color);
        System.out.println(three.price);
        System.out.println(three.brand);
    }

    //对象作为方法参数进行传递
    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }

    //对象作为方法返回值进行传递
    //谁调用getPhone方法就把two的地址赋值给谁
    public static Phone getPhone(){
        Phone two = new Phone();
        System.out.println(two);
        two.brand="华为";
        two.price=8388.0;
        two.color="玫瑰金";
        return two;
    }
}
