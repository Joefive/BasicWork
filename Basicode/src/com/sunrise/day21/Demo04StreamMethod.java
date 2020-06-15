package com.sunrise.day21;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * forEach(Consumer<? super T> action)方法：传递的是消费型接口，根据Consumer
 * filter(Predicate<? super T> predicate)方法：转换流,传递的是判断型接口，根据Predicate接口
 * map(Function <? super T> function)方法，可以将元素映射到另外一个流中,转换流，根据Function接口
 * count()方法，终结方法，返回long类型的值；用来统计stream流中的元素个数
 * limit()方法，返回stream流中的前几个元素；
 * skip()方法，跳过前几个元素，返回一个新流。
 * concat()方法，合并两个流
 */

public class Demo04StreamMethod {
    public static void main(String[] args) {
        String[] arr = {"张一", "张二", "张三"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach((String s) -> {
            System.out.println(s);
        });
        System.out.println("=================");

        Stream<String> stream1 = Stream.of("张一一", "王二", "张三", "赵四", "张五五");
        Stream<String> stream2 = stream1.filter((String s) -> {
            return s.startsWith("张");
        }).filter((String s) -> {
            return s.length() == 3;
        });
        stream2.forEach((String s) -> {
            System.out.println(s);
        });
        System.out.println("=================");
        //映射流，字符串转换成整型
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("102");
        list.add("345");
        Stream<String> stream3 = list.stream();
        Stream<Integer> integerStream = stream3.map((s) -> {
            return Integer.parseInt(s);
        });
        integerStream.forEach(i-> System.out.println(i));
        System.out.println("=================");
        //统计元素个数
        Stream<String> stream4 = list.stream();
        long count = stream4.count();
        System.out.println(count);
        System.out.println("=================");
        //取前几个元素
        Stream<String> arr1 = Stream.of(arr);
        Stream<String> limit = arr1.limit(1);
        limit.forEach(s-> System.out.println(s));
        System.out.println("=================");
        //跳过前几个元素
        Stream<String> arr2 = Stream.of(arr);
        Stream<String> skip = arr2.skip(1);
        skip.forEach(s-> System.out.println(s));
        System.out.println("=================");
        //合并两个流
        String[] listArr = list.toArray(new String[0]);
        //Stream<ArrayList<String>> con1 = Stream.of(listArr);
        Stream<String> con1 = Stream.of(listArr);
        Stream<String> con2 = Stream.of(arr);
        Stream<Serializable> concat = Stream.concat(con1, con2);
        concat.forEach(s-> System.out.print(s+" "));


    }
}
