package com.sunrise.day07;

/**
 * 接口类的使用：
 * 1.接口类不能直接使用必须使用实现类；
 * 2.接口类的实现类必须要重写接口里面所有的抽象方法；
 * 3.实例化实现类进行使用。
 */
public class ImplementsInterface implements NewInterface {

    @Override
    public void methodAbs() {
        System.out.println("实现类第一个方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("实现类第二个方法");
    }

    @Override
    public void methodAbs3() {
        System.out.println("实现类第三个方法");
    }

    @Override
    public void methodAbs4() {
        System.out.println("实现类第四个方法");

    }
}
