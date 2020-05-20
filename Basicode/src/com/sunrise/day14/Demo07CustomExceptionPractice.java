package com.sunrise.day14;

import java.util.Scanner;

public class Demo07CustomExceptionPractice {
    static String[] username = {"张三", "李四", "王五"};

    public static void main(String[] args) /*throws CustomException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个用户名：");
        String name = sc.next();
        checkUsername(name);
    }

    public static void checkUsername(String name) /*throws CustomException*/ {
        for (String s : username) {
            if (s.equals(name)) {
                try {
                    throw new CustomException("亲，您输入的用户名：" + username + "已经存在了！");
                } catch (CustomException e) {
                    e.printStackTrace();
                    return; //使用return来结束方法
                }
            }
        }
        System.out.println("恭喜您，用户名：" + name + "，注册成功！");
    }
}
