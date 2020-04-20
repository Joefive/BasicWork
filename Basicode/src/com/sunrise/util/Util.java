package com.sunrise.util;

/**
 * 工具类
 */
public class Util {
    /**
     * 封装冒泡算法
     *
     * @param arr
     */

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //外循环：比较的趟数是n=len-1
            for (int y = 0; y < arr.length - 1 - i; y++) { //内循环：第i趟比较的次数n-i=(len-1)-i
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    temp = arr[y + 1];
                }
            }
        }
    }

    /**
     * 封装打印数组方法
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]" + "\n");
            }
        }
    }

    /**
     * 封装数组查询最大值方法
     *
     * @param arr
     * @return
     */
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 数组元素反转
     *
     * @return
     */
    public static int[] reverseArray(int[] arr) {
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }

    /**
     * 返回值为数组，计算3个数的和与平均数
     *
     * @param a
     * @param b
     * @param c
     * @return arr[0]=sum,arr[1]=avg
     */
    public static int[] calculateArray(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //int[] arr = {sum, avg};
         int[] arr = new int[2];
         arr[0]=sum;
         arr[1]=avg;
        return arr;
    }

}
