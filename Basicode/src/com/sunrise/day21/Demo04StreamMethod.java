package com.sunrise.day21;

import java.util.stream.Stream;

/**
 * forEach(Consumer<? super T> action)方法：传递的是消费型接口
 * filter(Predicate<? super T> predicate)方法：转换流,传递的是判断型接口
 */

public class Demo04StreamMethod {
    public static void main(String[] args) {
        String[] arr = {"张一","张二","张三"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach((String s)->{
            System.out.println(s);
        });

        Stream<String> stream1 = Stream.of("张一一", "张二", "张三", "李四", "张五五");
        Stream<String> stream2 = stream1.filter((String s) -> {
            return s.startsWith("张");
        });
        stream2.forEach((String s)->{
            System.out.println(s);
        });

    }
}
