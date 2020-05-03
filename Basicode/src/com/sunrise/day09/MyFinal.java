package com.sunrise.day09;

/**
 * final关键字修饰：
 * 1.修饰的类不能被继承，所以成员方法不能被重写；
 * 2.修饰的方法，也就是最终方法，不能被重写；
 * 3.不能和abstract关键字一起使用，因为抽象方法一定要不实现才能使用；
 * 4.成员变量使用final需要手动赋值，不会再给默认值；
 * 5.对于final成员变量要么使用构造赋值，要么使用直接赋值，二选一。
 */
public final class MyFinal {
    private final String name = "张三";

/*    public MyFinal() {
        name = "张三";
    }

    public MyFinal(String name) {
        this.name = name;
    }
    */

    public String getName() {
        return name;
    }
}
