package com.sunrise.day17;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 从硬盘到内存中。
 * 抽象超类，需要实例化子类FileInputStream子类；
 * 构造方法：FileInputStream(String name) 路径
 * FileInputStream(File file) 文件
 * 方法：read()方法，一次读取一个字节，末尾返回-1；【read方法读取一次指针会向后移动一位】
 */
public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\BAK\\a.txt");
/*        int read = fis.read();
        System.out.println(read);
        int read1 = fis.read();
        System.out.println(read1);
        int read2 = fis.read();
        System.out.println(read2);
        int read3 = fis.read();
        System.out.println(read3);
        fis.close();*/
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
        fis.close();
    }
}
