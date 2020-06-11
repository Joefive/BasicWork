package com.sunrise.day20.Lambda;

/**
 * 日志等级，只有日志level==1的时候，才显示字符串拼接；
 * 问题：但是过程中已经有了字符串拼接过程，浪费时间，浪费内存；
 */
public class Logger {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "Java ";
        String str3 = "World..!";
        show(2, str1 + str2 + str3);
        //show(1, str1 + str2 + str3);
    }

    public static void show(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }

}
