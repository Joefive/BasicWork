package com.sunrise.day08;

public class Son extends Father{
    int num = 20;
    int num2 = 30;
    @Override
    public void method() {
        System.out.println("子类method方法...!");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void show(){
        System.out.println("运行看右边...!");
    }
}
