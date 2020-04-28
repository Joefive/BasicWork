package com.sunrise.day06;

/**
 * 抽象类：图形可以派生出矩形、三角形、圆形；
 * 计算图形面积可以是一个抽象方法，因为无法具体到计算矩形面积、三角形面积、圆形面积；
 * 抽象类不能被实例化，所以只能被继承；
 * 抽象方法所在的类必须是抽象方法，抽象类不一定有抽象方法。
 */
public abstract class Demo05Abstract {
    public Demo05Abstract() {
        System.out.println("1.Abstract类构造方法执行！");
    }

    //抽象方法：去掉普通方法的大括号后面加上分号
    public abstract void method();

    public void normalMethod() {
        System.out.println("抽象父类的普通方法！");
    }
}
