package com.sunrise.day20;

import java.util.function.Consumer;

/**
 * 和Supplier接口相反，消费掉一个对象，根据接口抽象方法accept(T t)方法，意思为消费掉一个指定泛型的数据。
 */
public class Demo05Consumer {
    public static void main(String[] args) {
        method("张一", (name) -> {
            System.out.println(name);
        });
        reverse("张学友",(str)->{
            String s = new StringBuffer(str).reverse().toString();
            System.out.println(s);
        });
    }

    /**
     * Consumer对象消费掉传递的String参数name
     * @param name
     * @param consumer
     */
    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void reverse(String str, Consumer<String> consumer){
        consumer.accept(str);
    }
}
