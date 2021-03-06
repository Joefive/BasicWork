package com.sunrise.day21;

import java.util.ArrayList;

/**
 * 流式模型JDK8以后，和字节流字符流不一样！
 * 管道流，只能被消费一次
 */

public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张一一");
        list.add("王二");
        list.add("李三");
        list.add("张五五");

        list.stream()
                .filter((s) -> s.startsWith("张"))
                .filter((s) -> s.length() == 3)
                .forEach((s) -> System.out.println(s));
    }
}
