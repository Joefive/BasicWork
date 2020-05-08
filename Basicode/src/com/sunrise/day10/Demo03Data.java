package com.sunrise.day10;

import java.util.Date;

/**
 * java.util.Data类代表一个瞬间，精确到毫秒
 * 2020-05-08 12:18:18:666
 * 2020-05-08 12:18:18:667
 * 时间原点：1970年1月1日00:00:00
 * 毫秒换算：1天=24小时*60分钟*60秒=86400秒*1000=86400000毫秒
 * 中国是东八区：加8个小时
 */

public class Demo03Data {
    public static void main(String[] args) {
        //从1970年1月1日00:00:00截止到现在有多少毫秒
        System.out.println(System.currentTimeMillis());
        //无参数构造
        Date da = new Date();
        System.out.println(da);
        System.out.println("===================");
        //有参数构造
        Date da1 = new Date(999999999999L);
        System.out.println(da1);
        Date da2 = new Date(0L);
        System.out.println(da2);
        System.out.println("===================");
        //日期转换成毫秒
        Date da3 = new Date();
        long time = da3.getTime();
        System.out.println(time);
        System.out.println("===================");

    }
}
