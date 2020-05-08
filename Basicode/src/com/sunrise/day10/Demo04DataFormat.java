package com.sunrise.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sunrise.util.Util;

/**
 * DataFormat是一个抽象类，无法别直接使用，可以使用子类SimpleDataFormat
 * String format(Data data),把字符串转换成日期格式
 * Data parse (String source),把符合模式的字符串解析成为Date日期
 * y年、M月、d日、H小时、m分、s秒 yyyy-MM-dd HH:mm:ss 【字母不能变，连接符可以变化】
 */
public class Demo04DataFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("================");
        demo02();
    }


    /**
     * 日期格式化成字符串：
     * 1.创建SimpleFormatData对象，构造器中传递制定模式；
     * 2.调用format方法，按照构造方法中制定的模式，把Data日期格式化成符合模式的文本；
     */
    private static void demo01() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String s = sd.format(date);
        System.out.println(date);
        System.out.println(s);
    }

    /**
     * 将字符串转换成日期类型：
     * 1.创建SimpleFormatData对象，制定字符串格式；
     * 2.调用parse方法将字符串解析成日期类型
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String s = sd.format(date);
        Date date1 = sd.parse(s);
        Date date2 = sd.parse("2018-08-08"); //parse中的参数必须跟SimpleDateFormat类中格式相同
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("================");
        //getTime方法：返回自1970年1月1日以来，由Date对象表示的00:00:00 GMT的毫秒数
        long time = date2.getTime();
        System.out.println(time);
        System.out.println("================");
        //计算两个日期相差的天数
        int i = Util.BetweenDays("2020-01-01", "2020-01-03");
        System.out.println("相差天数:" + i);
    }
}
