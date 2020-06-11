package com.sunrise.day20;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator接口就是函数式接口
 */
public class Demo04Comparator {
    public static Comparator<String> getComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串进行降序排序
                return o1.length() - o2.length();
            }
        };
    }

    public static void main(String[] args) {
        String[] arr = {"eee", "a", "fff", "gg", "c"};
        System.out.println("Before ：" + Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println("After : " + Arrays.toString(arr)); //排序后：[a, c, gg, eee, fff]
    }
}
