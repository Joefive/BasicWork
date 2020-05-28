package com.sunrise.day16;

import java.io.File;

/**
 * 遍历获取文件夹中所有文件：
 * public String[] list()方法,可以显示隐藏文件，如果路径错误抛出空指针异常
 * public File[] listFiles()方法,返回File对象，可以显示单个文件的完整路径
 */

public class Demo03FileErgodic {
    public static void main(String[] args) {
        //1.String类型数组[]遍历方法
        File file = new File("C:\\TEMP1\\test");
        try {
            String[] str = file.list();
            for (String fileName : str) {
                System.out.println(fileName);
            }
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("===================");

        //2.file类型数组[]遍历方法
        File file1 = new File("C:\\TEMP\\test");
        try{
            File[] files = file1.listFiles();
            for(File f:files){
                System.out.println(f);
            }

        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
