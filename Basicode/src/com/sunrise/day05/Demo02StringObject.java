package com.sunrise.day05;

/**
 * public boolean equals(Object obj),Object可以接收任何对象。
 * equal方法是对字符串内容比较，==是对地址比较；
 * a.equals.b与b.equals.a效果相同,比较的时候把常量放在前面
 */
public class Demo02StringObject {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        String str4 = "hello";
        System.out.println(checkEqual(str1, str2));
        System.out.println(checkEqual(str3, str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }

    public static Boolean checkEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
