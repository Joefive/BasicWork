package com.sunrise.day09.packThree;

/**
 * 局部内部类调用外部类成员变量，该成员变量需要时静态变量
 * 原因：生命周期问题，成员变量是在stack内存中，随着方法的消失出栈，但是new出来的对象在heap内存中，需要等到垃圾回收
 */
public class MyOuter {
    public void methodOuter() {
        int num = 10;
        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
