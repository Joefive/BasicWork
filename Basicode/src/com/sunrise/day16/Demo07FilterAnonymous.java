package com.sunrise.day16;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * File类过滤文件方法：
 * 1.listFiles(FileFilter filter)方法(原遍历文件夹文件方法)，里面传递构造器参数的路径；
 * filter接口，调用里面抽象方法boolean accept(File pathname)
 * 2.listFiles(FilenameFilter filter)
 * filter接口，调用boolean accept(File dir,String name)
 */

public class Demo07FilterAnonymous {
    public static void main(String[] args) {
        File file = new File("e:\\test");
        searchFile(file);
    }

    public static void searchFile(File dir) {
        //1.FileFilter方法，匿名对象
/*        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".xlsx");
            }
        });*/
        //2.FilenameFilter方法，匿名对象
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".xlsx");
            }
        });
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
