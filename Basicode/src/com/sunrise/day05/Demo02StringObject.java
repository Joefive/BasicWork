package com.sunrise.day05;

import java.util.Scanner;
import com.sunrise.util.Util;

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

        /**
         * 字符串常用方法：
         * 1.public int length()：获取字符串中含有字符个数，拿到长度；
         * 2.public String concat(String str)：将当前字符串与参数字符串拼接
         * 3.public char charAt(int index)：获取制定索引位置的单个字符。
         * 4.public int indexOf(String str)：查找参数字符串在本字符串中首次出现的位置，返回索引值，没有返回-1
         * 5.public String substring (int index):返回从index开始到结尾的数据。
         * 6.public String substring (int begin,int end):返回从begin开始到end结尾的数据。[)左闭右开，包含左边，不包含右边
         */
        int stringLength = str1.length();
        System.out.println(stringLength);
        String str5 = str1.concat(" World");
        System.out.println(str5);
        char stringChar = str1.charAt(1);
        System.out.println(stringChar);
        int stringIndexOf = str1.indexOf("llo");
        System.out.println(stringIndexOf);

        /**
         * 5.public String substring (int index):返回从index开始到结尾的数据。
         * 6.public String substring (int begin,int end):返回从begin开始到end结尾的数据。[)左闭右开，包含左边，不包含右边
         */
        String str6 = str1.substring(1);
        System.out.println(str6);
        String str7 = str1.substring(1, 3); //"Hello"(1,3)从1号跟2号元素
        System.out.println(str7);

        /**
         * 7.public char[] toCharArray():将字符串转换成char类型数组
         * 8.public byte[] getByte():转换成底层byte类型数组
         * 9.public String replace(charSequence oldString,charSequence newString)：出现的第一个参数，替换成第二个参数
         */
        String str8 = "HelloWorld";
        char[] chars = str8.toCharArray();
        System.out.println(chars[0]);
        byte[] bytes = str8.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String lang1 = str8.replace("llo", "qqq");
        System.out.println(lang1);

        /**
         * 10.public String[] split(String regex):按照参数规则进行分割
         * split的参数实际是正则表达式
         * 参数如果是"."需要使用正则表达式"\\."
         */
        String str9 = "aaa,bbb,ccc";
        String[] array1 = str9.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String str10 = "XXX.YYY.ZZZ";
        String[] array2 = str10.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        //练习1：{1,2,3}换成{word1#word2#word3}
        int[] arr = {1, 2, 3};
        String str11 = "word";
        String s = stringConcat(arr, str11);
        System.out.println(s);

        //练习2：输入一个字符串判断其中大写、小写字母、数字，其他字符
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        Util.countKind(inputString);

    }

    public static Boolean checkEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 练习1，字符串的拼接可以使用str+=
     *
     * @param arr
     * @param str
     * @return 返回拼接后字符串
     */
    public static String stringConcat(int[] arr, String str) {
        String str1 = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str1 += str + arr[i] + "]";
            } else {
                str1 += str + arr[i] + "#";
            }
        }
        return str1;
    }

}
