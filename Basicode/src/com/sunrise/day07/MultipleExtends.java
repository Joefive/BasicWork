package com.sunrise.day07;

/**
 * 接口可以进行多继承。
 * 1.如果两个父接口中的虚拟方法
 * 1.如果两个父接口中有相同的default方法，子类必须对default方法进行重写。
 */
public interface MultipleExtends extends NewInterface, ConstInterface {
    public void multipleMethod();

    @Override
    default void methodDefaultB() {
        System.out.println("多继承default方法已继承");
    }
}
