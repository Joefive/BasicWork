package com.sunrise.day20.FunctionalInterface;

/**
 * 函数式接口：只有一个抽象方法的接口；但是可以有默认方法
 * 语法糖：增强for循环底层是Iterator,可以称为语法糖；Lambda表达式可以看做匿名内部类的语法糖。
 * 注解为函数式接口：@FunctionalInterface
 */

@FunctionalInterface
public interface Demo01FunctionalInterface {
        public abstract void myMethod();
}
