package com.sunrise.day20.Lambda;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Lambda表达式是延迟执行，刚好可以解决以上日志等级加载message的问题
 * 在showLog()方法中，只有满足level==1的时候，拼接字符串代码才会执行【LAMBDA延迟执行】,不会存在性能浪费
 */
public class Lambda {
    public static void showLog(int level, MessageBuilder messageBuilder) {
        if (level == 1) {
            System.out.println(messageBuilder.builderMessage());
        }
    }
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "Java ";
        String str3 = "World..!";
        //函数式接口MessageBuilder，可以使用Lambda表达式作为参数
        showLog(2, () -> {
            System.out.println("Meet the Conditions..!"); //不满足条件不执行
            return str1 + str2 + str3;
        });
    }
}
