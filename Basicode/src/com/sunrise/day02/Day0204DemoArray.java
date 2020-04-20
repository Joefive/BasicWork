package com.sunrise.day02;

import java.util.Arrays;
import com.sunrise.util.Util;

/**
 * 数据类型相同的一组数据，数组是引用类型：1.静态初始化；2.动态初始化；
 * 确定了数组内容使用静态初始化；不确定长度内容使用动态初始化。
 */
public class Day0204DemoArray {

    public static void main(String[] args) {
        Util ut = new Util();
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
        System.out.println("arrayD内存地址：" + arrayD);
        arrayD[0] = 10;
        arrayD[1] = 11;
        arrayD[2] = 12;
        System.out.println(arrayD[2]);

        int[] arrayE = arrayD; //arrayD的内存地址赋给了arrayE,指向heap中同一块地址
        //int[] arrayE = new int[3];
        System.out.println("arrayE内存地址：" + arrayE);
        arrayE[0] = 22;
        arrayE[1] = 23;
        arrayE[2] = 24;
        System.out.println(arrayD[2]);

        /**
         * 数据越界：查找没有下标的数据
         * ArrayIndexOutOfBoundsException
         * 空指针：没有new出来的东西进行了访问
         * java.lang.NullPointerException
         */
        int[] arrError = null;
        //System.out.println(arrayD[5]);
        //System.out.println(arrError[0]);

        int[] numArray = new int[]{1, 2, 3};
        int[] numArray1 = {12, 9, 3, 1, 22};

        int numArray2[] = new int[3];
        int[] numArray3 = new int[3];

        System.out.println(numArray);
        System.out.println(numArray1);
        System.out.println(numArray2);
        System.out.println(numArray3);

        for (int i = 0; i < numArray1.length; i++) {
            System.out.println(numArray1[i]);
        }
        for (int num : numArray1) {
            System.out.println(num);
        }
        System.out.println("==================");

        /**
         * 冒泡排序：每趟比较完最大的数字进行沉淀到末位
         * n个数组要完成排序，总共进行的n-1趟，每i趟排序的次数等于n-i次(i是第几次)
         */
        Arrays.sort(numArray1);
        for (int num : numArray1) {
            System.out.println(num);
        }

        //调用排序方法>调用打印方法>调用最大值方法
        ut.bubbleSort(numArray1);
        System.out.println("======================");
        ut.printArray(numArray1);
        System.out.println("======================");
        System.out.println("max=" + ut.maxArray(numArray1));
        System.out.println("**********************");
        //printArray(reverseArray(numArray1));
        System.out.println(Arrays.toString(ut.reverseArray(numArray1)));
        System.out.println("**********************");
        int[] result = ut.calculateArray(1, 3, 5);
        System.out.println("求和=" + result[0]);
        System.out.println("品均值=" + result[1]);
    }





}

