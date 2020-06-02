package com.sunrise.day17;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件是否续写根据FileWriter构造方法，里面append参数为true为续写，使用false将重新创建文件；
 * 通常需要使用try，catch来捕获异常，因为构造器文件路径可能为错，无论流程执行是否正确，需要将流关闭
 * 需要将close()方法写入finally()方法中。
 * JDK7新特性，可以把流对象放入try(作用与之在括号内)中，执行完后可以直接释放资源，不用close()
 */
public class Demo08FileWriterAppend {
    public static void main(String[] args) {
        FileWriter fr = null;
        try {
            fr = new FileWriter("i:\\BAK\\j.txt", true);
            for (int i = 0; i < 10; i++) {
                fr.write("HelloWorld...!" + i + "\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
