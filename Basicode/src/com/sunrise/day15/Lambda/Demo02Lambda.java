package com.sunrise.day15.Lambda;

/**
 * Lambda表达式：函数式编程，不是面向对象思想，只要针对匿名对象，匿名接口使用
 * 一个参数，一个箭头，一段代码
 * 1. 不需要参数,返回值为5： () -> 5
 * 2. 接收一个参数(数字类型),返回其2倍的值：x -> 2 * x
 * 3. 接受2个参数(数字),并返回他们的差值：(x, y) -> x – y
 * 4. 接收2个int型整数,返回他们的和： (int x, int y) -> x + y
 * 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)：(String s) -> System.out.print(s)
 * 省略写法：
 * 1.括号中参数列表的参数类型，可以省略不写；
 * 2.如果{}中只有一行代码，无论是否有返回值，都可以省略{}，return，分号。
 */

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "Lambda表达式代码生成线程!");
        }).start();

        //省略格式的Lambda表达式
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "Lambda表达式生成代码【2】！")).start();
    }

}
