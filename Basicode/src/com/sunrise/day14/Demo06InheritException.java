package com.sunrise.day14;

/**
 * 1.父类抛出什么异常，子类就抛出什么异常；
 * 2.父类抛出异常，子类可以抛出父类异常对象的子类；
 * 3.父类抛出异常，子类可以不抛出异常；
 * 4.父类没有异常，子类不能抛出异常只能使用try...catch异常。
 */

public class Demo06InheritException {
    public void demo01() throws NullPointerException, IndexOutOfBoundsException {
    }

    public void demo02() throws IndexOutOfBoundsException {
    }

    public void demo03() throws IndexOutOfBoundsException {
    }

    public void demo04() {
    }
}

class Son extends Demo06InheritException {
    @Override
    public void demo01() throws NullPointerException, IndexOutOfBoundsException {
    }

    @Override
    public void demo02() throws ArrayIndexOutOfBoundsException {
    }

    @Override
    public void demo03() {
        super.demo03();
    }

    @Override
    public void demo04() {
        try {
            throw new Exception("父类没有异常，子类只能try...catch来捕获异常！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
