package com.sunrise.day21;

import java.util.*;
import java.util.stream.Stream;

/**
 * 是来自数据源的元素队列；stream流只会按照需求计算，不会存储元素；
 * 获取方法：1.只要是Collection接口，都可以直接调用stream()方法获取；
 *          2.可以调用Stream<T>接口，里面的of()方法来获取；
 */

public class Demo03GetStream {
    public static void main(String[] args) {
        //List集合
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        //Set集合
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();
        //Map集合也可以根据keySet方法获取，keySet方法获取的是map中key集合
        Map<String,String> map = new HashMap<>();
        Set<String> key = map.keySet();
        Stream<String> stream2 = key.stream();
        //将Map的value值进行转换
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();
        //可以根据entry方法
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream4 = entries.stream();
        //数组对象使用接口生成stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //字符串数组对象
        String[] arr = {"a","b","c"};
        Stream<String> arr1 = Stream.of(arr);


    }
}
