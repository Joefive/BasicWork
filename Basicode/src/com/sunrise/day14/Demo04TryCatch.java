package com.sunrise.day14;

import java.io.IOException;

/**
 * 自己处理异常：
 * 1.try可以一次catch多个异常，但是只会执行其中的一个；
 * 2.try中如果产生异常会执行catch中代码，catch中代码执行完成后，可以执行后续代码；
 * 3.try中如果没有异常，不会执行catch中代码，直接执行后续代码；
 * 常用异常处理方法：
 * 1.getMessage()方法;2.toString()方法；3.printStackTrace()方法；
 * finally方法：是否出现异常都会执行
 * 1.finally方法不能进行单独使用必须和try一起使用；
 * 2.finally一般用于资源释放(IO流中资源释放)，无论是否出现异常，都会释放资源；
 */

public class Demo04TryCatch {
    public static void main(String[] args) {
        try {
            checkFile("c:\\a.tx");
        } catch (IOException e) {
            //System.out.println("文件名后缀错了！");
            //1.getMessage方法
            //String message = e.getMessage();
            //System.out.println(message);
            //2.toString方法
            //System.out.println(e.toString());
            //3.printStackTrace方法
            e.printStackTrace();
        } finally {
            System.out.println("***finally代码段已执行***");
        }
        System.out.println("1.后续执行代码！");
    }

    public static void checkFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("IO异常，文件名后缀不正常！");
        }
        System.out.println("文件路径正常，读取成功！");
    }
}
