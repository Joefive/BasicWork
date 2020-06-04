package com.sunrise.day18;

import java.io.*;

/**
 * 继承了Writer类，字符转换为字节的过程
 * void close()关闭流，先刷新。
 * void flush()刷新流。
 * String getEncoding()返回此流使用的字符编码的名称。
 * void write(char[] cbuf, int off, int len)写入字符数组的一部分。
 * void write(int c)写一个字符
 * void write(String str, int off, int len)写一个字符串的一部分。
 * 构造器：
 * OutputStreamWriter(OutputStream out)创建一个使用默认字符编码的OutputStreamWriter。
 * OutputStreamWriter(OutputStream out, Charset cs)创建一个使用给定字符集的OutputStreamWriter。 默认UTF-8
 * OutputStreamWriter(OutputStream out, CharsetEncoder enc)创建一个使用给定字符集编码器的OutputStreamWriter。
 * OutputStreamWriter(OutputStream out, String charsetName)创建一个使用命名字符集的OutputStreamWriter。
 * 步骤：1.创建OutputStreamWriter对象；2.使用write()方法写入；3.flush()，close()；
 */

public class Demo08OutputStreamWriter {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;

        {
            try {
                osw = new OutputStreamWriter(new FileOutputStream("E:\\BAK\\FileOutputStream.txt"), "UTF-8");
                osw.write("哈哈");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    osw.flush();
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
