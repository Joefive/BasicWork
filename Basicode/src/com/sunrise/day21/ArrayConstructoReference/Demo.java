package com.sunrise.day21.ArrayConstructoReference;

/**
 * 调用createArray方法，使用函数式来创建数组
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = createArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(arr.length);
        //使用方法引用
        int[] arr1 = createArray(20, int[]::new);
        System.out.println(arr1.length);

    }

    public static int[] createArray(int length, ArrayBuilder ab) {
        return ab.builderArray(length);
    }
}
