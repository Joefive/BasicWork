package com.sunrise.day20;

import java.util.function.Function;

/**
 * Function<T R>接口：将泛型T类型的参数，转换成R类型的参数
 * 方法：apply()方法：
 */
public class Demo07Function {
    public static void main(String[] args) {
        String str = "123";
        change(str, (String s) -> {
            return Integer.parseInt(str);
        });
        System.out.println("==================");

        //优化Lambda表达式,只有一个参，可以省略类型、小括号、大括号、return
        change(str, s -> Integer.parseInt(str));
        System.out.println("==================");

        functionAndThen(str, (String s) -> {
            return Integer.parseInt(str) + 10;
        }, (Integer i) -> {
            return i + "";
        });
        System.out.println("==================");

        String str2 = "张一,33";
        int num = linkAge(str2, (String s) -> {
            return str2.split(",")[1];
        }, (String s) -> {
            return Integer.parseInt(s);
        }, (Integer i) -> {
            return i + 200;
        });
        System.out.println(num);
    }

    /**
     * 将String类型转换成Integer类型
     *
     * @param str
     * @param fun
     */
    public static void change(String str, Function<String, Integer> fun) {
        Integer integer = fun.apply(str);
        System.out.println(integer);
    }

    /**
     * 将字符串str先转换成int类型+10；然后在将int类型转换成String类型
     *
     * @param str
     * @param fun1
     * @param fun2
     */
    public static void functionAndThen(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String result = fun1.andThen(fun2).apply(str);
        System.out.println(result);
    }

    /**
     * 从字符串中获取年龄，将年龄字符串转化成整型，将获取数字+100，最终返回数字
     *
     * @param str  "name,age"
     * @param fun1
     * @param fun2
     * @param fun3
     * @return
     */
    public static int linkAge(String str, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }
}
