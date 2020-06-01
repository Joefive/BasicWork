package com.sunrise.day17;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字节流读取中文会出现问题：因为GBK中一个中文2个字节，UTF-8中一个中文3个字节；
 * 所以引出字符流：可以读取字符，中文英文都可以进行读取；
 * Reader抽象超类，需要实例化主要子类InputStreamReader进行使用(子类FileReader)
 * 构造器：FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
 * FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。
 * 方法：read()：读取一个字符；
 * 步骤：1.创建FileReader对象；2.使用read()方法读取文件；3.释放资源；
 */

public class Demo06FileReader {
    public static void main(String[] args) throws IOException {
        //字节流读取中文问题
        FileInputStream fis = new FileInputStream("E:\\BAK\\b.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }
        System.out.println();
        fis.close();
        System.out.println("============");

        FileReader fr = new FileReader("E:\\BAK\\b.txt");
/*        int fl = 0;
        while ((fl = fr.read())!=-1){
            System.out.print((char) fl);
        }
        fr.close();*/
        char[] chars = new char[1024];
        int fileLength = 0;
        while ((fileLength = fr.read(chars)) != -1) {
            System.out.println(new String (chars,0,fileLength));
        }
        fr.close();
    }
}
