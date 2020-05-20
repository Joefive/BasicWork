package com.sunrise.day14;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1.throws关键字必须写在方法后面；
 * 2.throws关键字后面声明的异常必须是Exception或者Exception的子类；
 * 3.调用了一个抛出异常的方法，就必须处理异常，要么throws出去交给JVM处理，要么进行try...catch处理；
 * 4.可以同时抛出多个异常，如果异常存在父类、子类关系，直接使用父类即可。
 * 缺点：【后续代码无法运行，虚拟机处理后中断】
 */

public class Demo03Throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.sql");
        //System.out.println("路径没有问题，成功读取文件！");
    }

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递文件路径不对，找不到文件。");
        }
        if (!fileName.endsWith(".txt")) {
            throw new IOException("IO异常，文件类型不对！");
        }
        System.out.println("文件路径没问题，获取正常！");
    }
}
