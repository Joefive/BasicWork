package com.sunrise.day03;

import java.util.Arrays;

import com.sunrise.util.Util;

/**
 * 面向对象三大特征：
 * 1.封装
 * 2.继承
 * 3.多态
 */

public class Day0301Object {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        Util ut = new Util();
        ut.printArray(arr);

        Day0302Student stu = new Day0302Student();
        stu.eat();
        stu.name = "李四";
        System.out.println(stu.name);

        Day0303Phone iPhone = new Day0303Phone();
        iPhone.brand="苹果";
        iPhone.color="土豪金";
        iPhone.price=9999.0;

        System.out.println("手机品牌:"+iPhone.brand+"，手机颜色:"+iPhone.color+"，手机价格:"+iPhone.price+"。");
        iPhone.call("张三");
        iPhone.sendMessage("李四","今天加班，晚点回家吃饭！");

    }
}