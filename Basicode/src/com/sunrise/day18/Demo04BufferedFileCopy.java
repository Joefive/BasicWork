package com.sunrise.day18;

import java.io.*;

//拷贝视频文件：1581毫秒,发现复制图片快，但是视频文件慢
public class Demo04BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\迅雷下载\\text\\2.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\BAK\\2.mp4"));
/*        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }*/
        byte[] bytes = new byte[1024 * 512];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes);
        }
        bis.close();
        bos.close();
        long e = System.currentTimeMillis();
        System.out.println("文件复制耗时：" + (e - s) + "毫秒");
    }
}
