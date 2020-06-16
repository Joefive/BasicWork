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
        //Util ut = new Util();
        Util.printArray(arr);

        Day0302Student stu = new Day0302Student();
        stu.eat();
        stu.name = "李四";
        System.out.println(stu.name);
/**
 * 创建对象过程；
 * 1.在方法区内存中创建.class（包含成员变量、成员方法）
 * 2.stack内存中开启main方法（压栈、近栈）；
 * 3.heap内存中进行new对象，创建成员变量，成员方法（成员方法保存的是方法区对应成员方法地址值）
 * 4.stack对成员变量赋值，改变成员变量内容；
 * 5.stack对成员方法进行调用(成员方法进栈)，调用完成后弹栈，自动销毁；
 * 6.执行到程序最后，main方法弹栈，销毁。
 */
        Phone iPhone = new Phone();
        iPhone.brand = "苹果";
        iPhone.color = "土豪金";
        iPhone.price = 9999.0;

        System.out.println("手机品牌:" + iPhone.brand + "，手机颜色:" + iPhone.color + "，手机价格:" + iPhone.price + "。");
        iPhone.call("张三");
        iPhone.sendMessage("李四", "今天加班，晚点回家吃饭！");

    }
}