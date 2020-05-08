package com.sunrise.day10;

import java.util.Calendar;

/**
 * Calendar类是日历类：是个抽象类
 * 里面提供了很多操作日期的方法，替代了大部分Date类的方法;(YEAR,MONTH,DAY,HOUR)
 * 西方的月份从0月开始，所以月份是0~11
 * 可以通过getInstance()静态方法获取一个对象
 */
public class Demo05Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //多态
        System.out.println(c);
    }
}
