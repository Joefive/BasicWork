package com.sunrise.day07;

/**
 * 1.一个实现类可以一次实现多个接口
 * 2.如果实现两个接口中有重复虚拟abstract方法，实现一个即可；
 * 3.如果实现两个接口中有个重复的默认default方法，必须对重复的方法进行重写;
 * 4.实现类继承了父类并且实现了接口，如果父类与接口中的方法重复，优先使用父类的方法；
 * 【继承优先于接口实现】
 */

public class MultipleInterface /*extends Object*/ extends Multiple implements NewInterface,DefaultInterface {

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodAbs2() {

    }

    @Override
    public void methodAbs3() {

    }

    @Override
    public void methodAbs4() {

    }

    @Override
    public void methodDefaultB() {
        System.out.println("321");
    }
}
