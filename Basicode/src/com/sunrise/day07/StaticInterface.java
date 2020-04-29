package com.sunrise.day07;

/**
 * 接口当中可以使用静态方法
 * 但是接口当中的静态方法不能通过实现类去调用
 * 直接通过接口名称.静态方法进行使用
 */
public interface StaticInterface {
    public static void methodStatic(){
        System.out.println("接口当中的静态方法");
    }
}
