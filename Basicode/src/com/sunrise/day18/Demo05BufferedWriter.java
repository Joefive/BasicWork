package com.sunrise.day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 给对应FileWriter对象一个缓冲区，提高传输速度；
 * 构造方法：BufferedWriter(Writer out)创建使用默认大小的输出缓冲区的缓冲字符输出流。
 * BufferedWriter(Writer out, int sz)创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
 * 特有方法：newLine()，写一行行分隔符。
 */

public class Demo05BufferedWriter {
    public static void main(String[] args) {
        //FileWriter fr = null;
        BufferedWriter br = null;
        try {
            //fr = new FileWriter("E:\\test\\BufferedWriter.txt");
            br = new BufferedWriter(new FileWriter("E:\\test\\BufferedWriter.txt"));
            for (int i = 0; i < 10; i++) {
                br.write("字符输出流！");
                br.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //br.flush();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
