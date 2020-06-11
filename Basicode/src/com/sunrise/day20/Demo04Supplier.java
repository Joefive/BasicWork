package com.sunrise.day20;

import java.util.function.Supplier;

/**
 * Supplier<T>,带泛型的生产型接口，对象中的get()方法，返回供应商名称，根据泛型就是new个新对象
 */
public class Demo04Supplier {
    public static void main(String[] args) {
        String s = getString(() -> {
            return "张一";
        });
        System.out.println(s);
        //省略表达式
        String s1 = getString(() -> "张二");
        System.out.println(s1);
        System.out.println("=============");

        int[] arr = {-23, 1, 100, 33, 44, 7, 0, 12, 54, 3};
        int num = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中最大值：" + num);
    }

    /**
     * 获取Supplier对象
     * @param sub
     * @return
     */
    public static String getString(Supplier<String> sub) {
        return sub.get();
    }

    /**
     * 计算数组中最大值
     * @param num
     * @return
     */
    private static int getMax(Supplier<Integer> num) {
        return num.get();
    }
}

