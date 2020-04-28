package com.sunrise.day06;

/**
 * 继承抽象类，重写抽象类方法需要取消掉Abstract关键字加上大括号即可；
 * 要继承了抽象类，必须要继承里面所有的抽象方法【可以分多个类来继承里面的抽象方法，必须要全部继承完】；
 */

public class Demo06AbstractInherit extends Demo05Abstract {
    public Demo06AbstractInherit() {
        System.out.println("2.继承Abstract类的构造方法执行！");
    }

    @Override
    public void method() {
        System.out.println("实现了Abstract类的抽象方法！");
    }

}
