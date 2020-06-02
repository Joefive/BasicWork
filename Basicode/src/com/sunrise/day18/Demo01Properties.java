package com.sunrise.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 集合类：父类是HashTable【已淘汰，单线程】
 * 与IO流相关的集合,双列集合
 * 方法：1.store(Writer/OutputStream,Comments)方法，集合数据持久化，写入到硬盘中,可以将字符流对象作为参数；
 * 2.load(Reader/InputStream,inStream/reader)方法，把硬盘数据(K,V)读取到内存中,一般都使用字符流，字节流乱码；
 * 3.setProperty()方法，给集合进行赋值；
 * 4.getProperty()方法，取出集合中的值；
 * 5.stringPropertyNames()方法，把集合的key值作为集合存储，相当于Map集合中的keySet()方法
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("1", "张一");
        p.setProperty("2", "张二");
        p.setProperty("3", "张三");
        Set<String> s = p.stringPropertyNames();
        for (String key : s) {
            String value = p.getProperty(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("===================");

        FileWriter fw = new FileWriter("E:\\BAK\\prop.txt");
        p.store(fw, "Properties Save Time...!");
        fw.close();
        System.out.println("===================");

        FileReader fr = new FileReader("E:\\BAK\\prop.txt");
        p.load(fr);
        Set<String> s1 = p.stringPropertyNames();
        for (String key : s1) {
            String value = p.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
