package com.sunrise.day17;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流，抽象超类Writer，需要实例化子类OutputStreamWriter的子类FileWriter子类
 * 步骤：【flush 刷新后，流可以继续使用，close刷新后，会将流关闭】
 * 1.FileReader构造方法进行绑定写入数据目的地；
 * 2.使用write()方法，进行写入字符流，与字节流区别，先把数据写入到内存缓冲区中将字符转换成字节；
 * 3.使用flush()方法，把内存缓冲区中数据刷新进入文档中；
 * 4.关闭流链接close()；
 */
public class Demo07FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\BAK\\e.txt");
        fw.write("你好！");
        fw.flush();
        fw.close();
        System.out.println("====================");
        FileWriter fw1 = new FileWriter("E:\\BAK\\f.txt");
        String str = "我擦嘞...!";
        char[] ch = {'E','F','G','J','K'};
        fw1.write(str);
        fw1.flush();
        fw1.write(ch);
        fw1.write(str,1,2);
        fw1.close();
    }
}
