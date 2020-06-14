package com.sunrise.day20;

import java.util.function.Consumer;

/**
 * 消费型接口，消费掉掉一个对象，根据接口抽象方法accept(T t)方法，意思为消费掉一个指定泛型的数据(用泛型参数)。
 * andThen()方法
 */
public class Demo05Consumer {
    public static void main(String[] args) {
        method("张一", (name) -> {
            System.out.println(name);
        });
        reverse("张学友", (str) -> {
            String s = new StringBuffer(str).reverse().toString();
            System.out.println(s);
        });
        concatString("HelloWorld..!", (con1) -> {
            System.out.println(con1.toUpperCase());
        }, (con2) -> {
            System.out.println(con2.toLowerCase());
        });
        String[] arr = {"张一,18", "张二,19", "张三,20"};
        printString(arr, (message) -> {
            String str1 = message.split(",")[0];
            System.out.print("姓名：" + str1);
        }, (message) -> {
            String str2 = message.split(",")[1];
            System.out.println("|年龄：" + str2 + ";");
        });
    }

    /**
     * Consumer对象消费掉传递的String参数name
     *
     * @param name
     * @param consumer
     */
    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    /**
     * 将传入字符串反序排列
     *
     * @param str
     * @param consumer
     */
    public static void reverse(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }

    /**
     * 拼接两个字符串对象，相当于把str参数进行两次消费
     *
     * @param str
     * @param con1
     * @param con2
     */
    public static void concatString(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
    }

    /**
     * 将字符串拆分，进行二次消费并拼接
     *
     * @param arr
     * @param con1
     * @param con2
     */
    public static void printString(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
