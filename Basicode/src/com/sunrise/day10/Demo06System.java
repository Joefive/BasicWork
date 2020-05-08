package com.sunrise.day10;

import java.util.Arrays;

public class Demo06System {
    public static void main(String[] args) {
        demo01();
        System.out.println("===========");
        demo02();
    }

    /**
     * 获取当前时间毫秒数
     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时：" + (e - s) + "毫秒！");
    }

    /**
     * 数组复制：
     * 将初始数组src从下标0开始，目标数组dest从下标0开始，长度3
     */
    private static void demo02() {
        int[] src = {11, 22, 33, 44, 55};
        int[] dest = {66, 77, 88, 99, 100};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }

}
