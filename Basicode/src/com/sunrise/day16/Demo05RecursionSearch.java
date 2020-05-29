package com.sunrise.day16;

import java.io.File;

/**
 * 文件夹中查找.doc结尾的文件
 */

public class Demo05RecursionSearch {
    public static void main(String[] args) {
        File file = new File("E:\\BAK");
        searchDoc(file);
    }

    public static void searchDoc(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        try {
            for (File f : files) {
                if (f.isDirectory()) {
                    searchDoc(f);
                } else {
                    if (f.getName().toLowerCase().endsWith(".doc")) {
                        System.out.println(f);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e+"文件路径不存在！");
        }

    }
}
