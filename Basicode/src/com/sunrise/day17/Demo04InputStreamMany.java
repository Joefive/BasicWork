package com.sunrise.day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo04InputStreamMany {
    public static void main(String[] args) throws IOException {
        String str = "HellWorld";
        char c = str.charAt(1); //索引位置元素
        System.out.println(c);
        int i = str.codePointAt(1); //字符串返回ASCII码表值
        System.out.println(i);
        System.out.println("====================");

        FileInputStream fis = new FileInputStream("E:\\BAK\\a.txt");
        //定义一个缓冲数组，存储每次读取到的多个自己，通常定义的是1024或者其整数倍
/*      byte [] bytes = new byte[1024];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        //String类构造方法，将代码单元转换成
        System.out.println(new String(bytes));

        int len2 = fis.read(bytes);
        System.out.println(len2);
        System.out.println(new String(bytes));

        int len3 = fis.read(bytes);
        System.out.println(len3);
        System.out.println(new String(bytes));
*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            //offset是数组开始索引，length是转换的个数
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }
}
