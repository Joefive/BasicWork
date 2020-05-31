package com.sunrise.day17;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 追加写入与覆盖写入，换行写入，根据两个参数的构造器
 * FileOutputStream(String name append boolean) append参数值是true表示追加写入，false表示覆盖原文件从新写入
 * FileOutputStream(File file append boolean)
 * 换行：windows使用\r\n linux使用/n Mac使用/r
 */

public class Demo02OutputStreamAppend {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\BAK\\c.txt",true);
        //换行写入10个“你好”
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
