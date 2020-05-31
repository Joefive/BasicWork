package com.sunrise.day17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * IO，input&output，从内存进入硬盘是out，从硬盘进入内存是input
 * 抽象超类OutPutStream，需要实例化常用子类， FileOutputStream
 * public void close() ：关闭此输出流并释放与此流相关联的任何系统资源；
 * public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出；
 * public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流；
 * public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流；
 * public abstract void write(int b) ：将指定的字节输出流；
 * 构造器：FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件； 路径
 *        FileOutputStream(String name) 创建文件输出流以指定的名称写入文件；文件名
 * 创建步骤：1.创建流对象，构造器传路径；2.调用写入方法write写入；3.释放关闭流close因为会占用内存资源。
 */

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\BAK\\output.txt");
        fos.write(97); //转换成二进制存入硬盘中,查询ASCII码
        fos.close();

        FileOutputStream fos1 = new FileOutputStream("E:\\BAK\\a.txt");
        //使用write(byte[])方法，写入字节要看第一位是正数还是负数
        //1.如果是正数直接查ASCII码表对应英文或者数字；2.如果是负数会与后面一个位组成汉字，查GBK表
        //byte[] bytes = {65,66,67,68,69};
        byte[] bytes = {-123,-12,-33,68,97};
        fos1.write(bytes);
        int i = fos1.hashCode();
        System.out.println(i);
        fos1.close();

        FileOutputStream fos2 = new FileOutputStream("E:\\BAK\\b.txt");
        byte[] bytes1 = {65,66,67,68,69};
        //写入索引开始位置off以后的长度len
        fos2.write(bytes1,1,2);
        String str = "我爱中国！";
        byte[] bytes2 = str.getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos2.write(bytes2);

        fos2.close();



    }
}
