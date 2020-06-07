package com.sunrise.day18;

import java.io.*;

/**
 * extends来自Reader超类，InputStreamReader是从字节流到字符流的桥：它读取字节，并使用指定的charset将其解码为字符
 * FileReader只能使用IDE默认编码表，如果要使用指定编码表例如：GBK就需要使用InputStreamReader
 * GBK(国标)两个字节存储
 * UTF-8(国际编码表)使用3个字节存储中文
 * 对应输出可以使用OutputStreamWriter
 */

public class Demo07InputStreamReader {
    public static void main(String[] args) throws IOException {
        //一写一读
        writeFile("E:\\BAK\\gbk.txt", "gbk");
        readFile("E:\\BAK\\gbk.txt", "gbk");
        //格式转换gbk格式文件转换成utf-8
        fileTransfer();
    }

    /**
     * 按照格式写入文件
     * @param path
     * @param charset
     */
    private static void writeFile(String path, String charset) {
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream(path), charset);
            try {
                osw.write("川建国,特朗普");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 按照格式转换文件
     * @param path
     * @param charset
     */
    private static void readFile(String path,String charset) {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream(path), charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int len =0;
        while(true){
            try {
                if (!((len=isr.read())!=-1)) break;
                System.out.print((char)len);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

            }

        }
    }

    /**
     * 转换gbk格式文件为utf-8格式
     * @throws IOException
     */
    private static void fileTransfer() throws IOException {
        //将GBK文件读取
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\BAK\\gbk.txt"),"gbk");
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("E:\\BAK\\gbk_to_utf-8.txt"),"utf-8");
        int len =0;
        while((len=isr.read())!=-1){
            osr.write(len);
        }
        isr.close();
        osr.close();
    }
}
