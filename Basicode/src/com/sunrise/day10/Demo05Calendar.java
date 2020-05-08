package com.sunrise.day10;

import java.util.Calendar;
import java.util.Date;

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
        demo01();
        System.out.println("==============");
        demo02();
        System.out.println("==============");
        demo03();
        System.out.println("==============");
        demo04();
    }

    /**
     * 常用get方法Calendar.YEAR获取年、calendar.MONTH获取月份、calendar.DATE获取日期、Calendar.DAY_OF_WEEK星期几
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; //西方月份0~11
        int day = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        int minute = c.get(Calendar.MINUTE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);
        System.out.println(minute);
    }

    /**
     *set方法，设置年月
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2032);
        c.set(2030,11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }

    /**
     * add方法，在当前时间进行增加时间，参数1是日期某个字段，参数2amount增加的时间
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /**
     * getTime方法,把日历转化成当前日期
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

}
