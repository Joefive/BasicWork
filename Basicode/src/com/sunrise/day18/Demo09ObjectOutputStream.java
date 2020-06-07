package com.sunrise.day18;

import java.io.*;

/**
 * 序列化流：把对象保存进入流中写入到文件中；writeObject()
 * 反序列化流：把文件中保存的对象读取出来;readerObject() 两个异常IO，ClassNotFound
 * 序列化需要对象需要实现：Serializable接口；
 * transient关键字：瞬态关键字，类似static关键字，静态优先进入内存中；static修改的无法进行序列化
 */
public class Demo09ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        Person p = new Person("张一", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\BAK\\objectOut.txt"));
        oos.writeObject(p);
        oos.close();
    }
}
