package com.sunrise.day20.FunctionalInterface;

/**
 * 实现函数式接口：可以作为方法的参数或者返回值类型。
 * 优点：使用Lambda表达式比匿名内部类优点：匿名内部类加载会产生Demo$1.class的字节码文件，加载内存繁琐；
 *      使用Lambda表达式不会有，代码更加简洁运行效率更高。
 */
public class Demo {
    public static void show(Demo01FunctionalInterface myInter) {
        myInter.myMethod();
    }

    public static void main(String[] args) {
        show(new FunctionalInterfaceImpl());
        //使用匿名内部类
        show(new Demo01FunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("System : Override myMethod Function...!");
            }
        });
        //使用lambda表达式
        show(() -> {
            System.out.println("System : Override myMethod Function with Lambda!");
        });
        //简化lambda表示
        show(() -> System.out.println("System : Override myMethod Function with Simplification Lambda!"));
    }
}
