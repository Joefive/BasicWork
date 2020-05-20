package com.sunrise.day14;

import java.util.Objects;

/**
 * 使用throw关键字，抛出指定异常
 * throw new xxxException("异常产生原因")
 * 1.throw关键字必须写在方法内部；
 * 2.throw后面不许跟Exception类或者子类；
 * 3.抛出异常就必须处理，如果是runtimeException可以不处理交给JVM处理，
 * 4.如果是编译异常就必须要自己处理try...catch；
 */

public class Demo02Throw {
    public static void main(String[] args) {
        //objectNoneNull(null);
        //int[] arr = null;
        int[] arr = {11, 22, 33};
        checkArray(arr, 4);

    }

    public static int checkArray(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("传递数组" + arr + "值为null，请核对！");
        }
        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException("数组越界！数组" + arr + "最大索引下标:" + arr.length + ",当前下标：" + index);
        }
        int i = arr[index];
        return i;
    }

    //Objects类中的requireNonNull可以直接判断对象是否为空
    public static void objectNoneNull(Object obj) {
/*        if (obj == null) {
            throw new NullPointerException("传入对象为空");
        }*/
        Objects.requireNonNull(obj);
    }
}
