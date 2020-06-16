package com.sunrise.day21.MethodReference;

/**
 * 双冒号为引用符号::
 * 方法的引用：复用了已有的方案
 */
public class Demo01Print {
    public static void main(String[] args) {
/*        printString((s)->{
            System.out.println(s);
        });*/
        System.out.println("===================");
        printString(System.out::println);
    }
    public static void printString(Printable p){
        p.print("Hello...World...!");
    }
}
