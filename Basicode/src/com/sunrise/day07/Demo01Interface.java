package com.sunrise.day07;

public class Demo01Interface {
    public static void main(String[] args) {
        ImplementsInterface inter = new ImplementsInterface();
        inter.methodAbs();
        inter.methodAbs3();
        System.out.println("=================");

        DefaultInterfaceImpl de = new DefaultInterfaceImpl();
        de.methodAbs();
        de.methodDefault(); //default方法可以被实现类继承可以不用重写。
        de.methodDefaultB(); //也可以重写default
        System.out.println("=================");

        StaticInterface.methodStatic();
        System.out.println("=================");

        System.out.println(ConstInterface.NUM_OF);
    }
}