package com.sunrise.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 工具类
 * 定义一个方法三要素：
 * 1.返回值；2.方法名称；3.参数列表。
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
        arr[0] = sum;
        arr[1] = avg;
        return arr;
    }

    /**
     * 打印ArrayList方法
     *
     * @param list
     */
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }

    /**
     * 输入一个字符串判断其中多少个大写、小写字母，数字，及其他字符
     *
     * @param str
     */
    public static void countKind(String str) {
        int coutUpper = 0;
        int coutLower = 0;
        int coutNum = 0;
        int coutOther = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                coutUpper++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                coutLower++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                coutNum++;
            } else {
                coutOther++;
            }
        }
        System.out.println("大写：" + coutUpper + "个，小写:" + coutLower + "个，数字:" + coutNum + "个，其他:" + coutOther + "个。");
    }

    /**
     * 反序排列arrayList<String>
     *
     * @param numArray
     */
    public static void resverArrayList(ArrayList<Integer> numArray) {
        System.out.print("[");
        for (int i = numArray.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numArray.get(i) + "]");
            } else {
                System.out.print(numArray.get(i) + ", ");
            }
        }
    }

    /**
     * 计算两个日期之间的相差的天数，获取字符串参数使用parse方法先转成Date类型，在使用getTime方法转成毫秒；
     * 计算两个日期之间的毫秒差；
     * @param d1
     * @param d2
     * @return
     */
    public static int BetweenDays(String d1, String d2){
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Long l = 0L;
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = sd.parse(d1);
            long time1 = date1.getTime();
            date2 = sd.parse(d2);
            long time2 = date2.getTime();
            l = (time2 - time1) / (24 * 60 * 60 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //intValue()方法在必须是L是引用类型得情况下使用
        return l.intValue();
    }




}
