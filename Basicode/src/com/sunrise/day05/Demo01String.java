package com.sunrise.day05;

/**
 * 程序中所有的"abc"的字符串，都是String类的对象。就算没有new也是。
 * 1.字符串内容永远不可改变，可以共享使用；
 * 2.字符串实际相当于是char[]类型的数组，底层是byte[]字节数组。
 * 【3+1】中方式：
 * 3种构造方法：
 * public String();
 * public String(char[] arr);
 * public String(byte[] arr);
 * 1种直接创建：String str = "hello"；也算是字符串对象，JVM已经进行了new
 * 字符串常量池：使用双引号就在字符串常量池里；heap中进行创建，new的字符串不在常量池中
 */

public class Demo01String {
    public static void main(String[] args) {
        String st = "abc";
        String str1 = new String();
        System.out.println("第一个字符串" + str1);

        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串" + str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串" + str3);

        String str4 = "abc";
        String str5 = "abc";
        char[] charCheck = {'a', 'b', 'c'};
        String str6 = new String(charCheck);

        System.out.println(str4 == str5);
        System.out.println(str4 == str6);
        System.out.println(str5 == str6);

    }
}
