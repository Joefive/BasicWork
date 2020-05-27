package com.sunrise.day16;

import java.io.File;

/**
 * java.io.File类：操作文件与文件夹
 * 作用：文件增删，判断是否存在，文件遍历，文件大小；
 * 绝对路径：E:\\Test\\Dictionaries\\text.sql
 * 相对路径：text.sql，省略掉根目录
 * 注意：1.路径不区分大小写；2.windows中路径\\两个反斜线代表\，是转义字符；
 */
public class Demo01File {
    public static void main(String[] args) {
        //路径分隔符 windows; linux：
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        //文件分隔符 windows\ linux /
        String separator = File.separator;
        System.out.println(separator);
        System.out.println("================");
        show01();
        show02("c:\\", "test.sql");
        show03();
    }

    private static void show01() {
        File file = new File("//u01//soft//app//oracle//test.sql");
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show03() {
        File parent  = new File("c:\\");
        File file = new File(parent,"child.sql");
        System.out.println(file);
    }

}
