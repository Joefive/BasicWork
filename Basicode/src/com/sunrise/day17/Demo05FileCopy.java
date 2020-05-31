package com.sunrise.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的复制：一读一写；
 */
public class Demo05FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\迅雷下载\\text\\timg.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\BAK\\timg.jpg");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        System.out.println("===================");
        fileCopy("E:\\迅雷下载\\text\\1.mp4", "E:\\BAK\\1.mp4");
        //资源释放，先关闭写入进程，再关闭读取进程；
        fos.close();
        fis.close();
    }

    private static void fileCopy(String fromPath, String disPath) throws IOException {
        FileInputStream fis = new FileInputStream(fromPath);
        FileOutputStream fos = new FileOutputStream(disPath);
        byte[] bytes = new byte[1024 * 512];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes);
        }
        fos.close();
        fis.close();
    }
}
