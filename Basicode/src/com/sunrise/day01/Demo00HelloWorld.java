package com.sunrise.day01;


import java.util.Scanner;

public class Demo00HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        printMsg();
        Scanner sc = null;
        Scanner sc1 = null;
        for (int i = 0; i < 3; i++) {
            System.out.println("循环次数==" + i);
        }
    }
    //打印到5行没行5个星号
        public static void printMsg () {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}