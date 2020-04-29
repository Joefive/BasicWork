package com.sunrise.day07;

public class DefaultInterfaceImpl implements DefaultInterface {
    @Override
    public void methodAbs() {
        System.out.println("方法1");
    }

    @Override
    public void methodDefaultB() {
        System.out.println("重写了接口中的default方法！");
    }
}
