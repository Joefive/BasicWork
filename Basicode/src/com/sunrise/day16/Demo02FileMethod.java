package com.sunrise.day16;

import java.io.File;
import java.io.IOException;

/**
 * File类常用方法：
 * 1.获取绝对路径：getAbsolutePath()，获取构造函数返回的绝对路径；如果参数是绝对路径，返回当前类的绝对路径；
 * 2.将路径转换成字符串getPath();
 * 3.获取文件/文件夹名称的方法：getName()返回路径结尾部分；
 * 4.获取文件大小：length()方法；只能获取文件大小，不能获取文件夹大小，返回byte字节数；路径不存在返回0；
 * 5.判断构造器传递路径是否存在exists()返回布尔值；
 * 6.判断构造器传递参数是文件夹还是文件：isDirectory(),isFile()，返回布尔值；
 * 7.创建构造器参数的文件：createNewFile()，只能创建文件，不能创建文件夹，要抛出IOException异常;
 * 8.创建文件夹的方法：mkdir()只能创建单级文件夹，mkdirs()可以创建多级文件夹；返回布尔值，只能创建文件夹；
 * 9.删除方法：delete()，删除构造器中的传递的参数路径，不走回收站，谨慎使用。
 */

public class Demo02FileMethod {
    public static void main(String[] args) {
        File file = new File("C:\\TEMP\\test\\new.txt");
        String path = file.getAbsolutePath();
        System.out.println(path);

        File file1 = new File("new.txt");
        String path1 = file1.getAbsolutePath();
        System.out.println(path1);
        System.out.println("====================");

        File file2 = new File("C:\\TEMP\\test\\new.txt");
        File file3 = new File("new.txt");
        String path2 = file2.getPath();
        String path3 = file3.getPath();

        System.out.println(path2);
        System.out.println(path3);
        System.out.println("====================");

        File file4 = new File("C:\\TEMP\\test\\test.sql");
        File file5 = new File("C:\\TEMP\\test\\new");
        String name = file4.getName();
        String name1 = file5.getName();
        System.out.println(name);
        System.out.println(name1);
        System.out.println("====================");

        File file6 = new File("C:\\TEMP\\test\\new.txt");
        long length = file6.length();
        System.out.println(length);
        System.out.println("====================");

        show01();
        System.out.println("**********");
        show02("C:\\TEMP\\test\\new.txt");
        System.out.println("**********");
        show03("C:\\TEMP\\test\\2.txt");
        System.out.println("**********");
        show04("C:\\TEMP\\test\\mkdir");
        System.out.println("**********");
        show05("C:\\TEMP\\test\\3.txt");
        show05("C:\\TEMP\\test\\new.txt");


    }


    //1.判断路径
    private static void show01() {
        File file = new File("C:\\TEMP\\test\\new.txt");
        boolean exists = file.exists();
        System.out.println(exists);
    }

    //2.文件路径是否存在
    private static void show02(String str) {
        File file = new File(str);
        if (file.exists()) {
            boolean directory = file.isDirectory();
            boolean file1 = file.isFile();
            System.out.println(str + "是否是路径：" + directory);
            System.out.println(str + "是否是路径：" + file1);
        } else {
            System.out.println(str + "路径不存在");
        }
    }

    //3.创建文件
    private static void show03(String str) {
        File file = new File(str);
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println(str + "路径创建成功：" + newFile);
            } else {
                System.out.println(str + "路径创建不成功：" + newFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4.创建文件夹
    private static void show04(String str) {
        File file = new File(str);
        boolean mkdir = file.mkdir();
        if (mkdir) {
            System.out.println(str + "文件夹路径创建是否成功：" + mkdir);
        } else {
            System.out.println(str + "文件夹路径创建不成功：" + mkdir);
        }
        File file1 = new File("C:\\TEMP\\test\\aaa\\bbb\\ccc");
        boolean mkdirs = file1.mkdirs();
        System.out.println("mkdirs:" + mkdirs);
    }

    //5.删除文件夹
    private static void show05(String str) {
        File file = new File(str);
        boolean delete = file.delete();
        System.out.println(str + "删除是否成功：" + delete);
    }

}
