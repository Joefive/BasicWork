package com.sunrise.day16;

import java.io.File;

/**
 * File类过滤文件方法：
 * 1.listFiles(FileFilter filter)方法(原遍历文件夹文件方法)，里面传递构造器参数的路径；
 * filter接口，调用里面抽象方法boolean accept(File pathname)
 * 2.listFiles(FilenameFilter filter)
 * filter接口，调用boolean accept(File dir,String name)
 */

public class Demo06Filter {
    public static void main(String[] args) {
        File file = new File("e:\\test");
        searchFile(file);
    }

    public static void searchFile(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());
        try {
            for (File f : files) {
                if (f.isDirectory()) {
                    searchFile(f);//递归：自己调用自己
                } else {
                    System.out.println(f);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e + "目录不存在");
        }
    }
}
