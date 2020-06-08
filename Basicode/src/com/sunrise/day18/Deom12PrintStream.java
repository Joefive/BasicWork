package com.sunrise.day18;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流：
 * 方法:1.可以输入打印流到制定文件；2.也可以输出打印流到制定路径
 */

public class Deom12PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("E:\\test\\printStream.txt");
        ps.print(123);
        ps.println(2222);
        ps.println("helloWorld");
        ps.println(true);
        ps.close();
        System.out.println("====================");
        PrintStream ps2 = new PrintStream("E:\\test\\printStream指定.txt");
        System.setOut(ps2);
        System.out.println("指定了输出内容信息！");
        ps2.close();
    }
}
