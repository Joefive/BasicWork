package com.sunrise.day20;

import java.util.function.Supplier;

/**
 * Supplier<T>,带泛型的生产型接口，对象中的get()方法，返回供应商名称，实际就是new个新对象
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
    }

    public static String getString(Supplier<String> sub) {
        return sub.get();
    }
}

