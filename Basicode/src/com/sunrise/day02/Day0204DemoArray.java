package com.sunrise.day02;

/**
 * 数据类型相同的一组数据，数组是引用类型：1.静态初始化；2.动态初始化；
 * 确定了数组内容使用静态初始化；不确定长度内容使用动态初始化。
 */
public class Day0204DemoArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] arrayEasy = {11, 22, 33, 44, 55}; //简化省略new与类型
        int[] arrayA = new int[5];
        double[] arrayB = new double[4];
        String[] arrayC = new String[3];
        int a = array[3];

        for (int i = 0; i < arrayEasy.length; i++) {
            System.out.println("array[" + i + "]=" + arrayEasy[i]);
        }
        System.out.println(a);
        /**
         * 内存管理：
         * 1.stack：栈内存，存放方法中的局部变量，出了大括号就销毁；
         * 2.heap：堆内存，凡是new出来的东西都在堆内存，有对应的16进制哈希码；
         * 堆内存有默认值；整数0；浮点0.0；字符\u0000,布尔false，引用类型<string>null
         * 3.方法区：包含方法信息，.class信息；
         * 4.本地方法栈：与操作系统相关
         * 5.寄存器：
         */
        int[] arrayD = new int[3];
        System.out.println("arrayD内存地址："+arrayD);
        arrayD[0]=10;
        arrayD[1]=11;
        arrayD[2]=12;
        System.out.println(arrayD[2]);

        int[] arrayE = arrayD; //arrayD的内存地址赋给了arrayE,指向heap中同一块地址
        //int[] arrayE = new int[3];
        System.out.println("arrayE内存地址："+arrayE);
        arrayE[0]=22;
        arrayE[1]=23;
        arrayE[2]=24;
        System.out.println(arrayD[2]);

    }
}

