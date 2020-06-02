package com.sunrise.day18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 输入缓冲流，与输出步骤相同；
 * String类构造方法可以将byte类型转换成字符串；
 */

public class Demo03BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\BAK\\Buffered.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
/*        int len = 0;
        while ((len = bis.read()) != -1) {
            System.out.println(len);
        }*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
    }
}
