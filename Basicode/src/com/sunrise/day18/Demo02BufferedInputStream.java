package com.sunrise.day18;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流实际上是对普通流的加强，高效读写，编码转换，持久化存储序列
 * 普通流一次只能读写一个字符或字节，缓冲流相当于创建一个数组，一次把所有的字节或者字符放入数组中，然后放入内存缓冲区
 * 构造器：BufferedOutputStream(OutputStream os),创建一个缓冲流，传入底层输出流
 * BufferedOutputStream(OutputStream os,int size)创建一个缓冲流，传入底层输出流，可以指定缓冲区域大小1024...
 * 步骤：1.定义FileOutputStream对象；2.定义BufferedOutputStream对象传入底层对象；3.调用write()方法；4.关闭流；
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("E:\\BAK\\Buffered.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);) {
             bos.write("这是一个刷新流".getBytes());
             //JDK7特性，可以省略flush(),close()方法
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
