package com.sunrise.day07;

/**
 * 接口当中可以定义"成员变量"，但是必须要用public static final三个关键字来进行修饰。
 * 静态变量名称需要完全大写字母，使用下划线分隔
 */
public interface ConstInterface {
    public static final int NUM_OF = 10;

    public default void methodDefaultB() {
        System.out.println("ConstInterface的默认方法执行了。");
    }
}
