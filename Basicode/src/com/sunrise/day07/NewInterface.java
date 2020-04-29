package com.sunrise.day07;

/**
 * 接口：多个类的公共规范
 * 接口中可以包含的内容：1.常量；2.抽象方法；3.默认方法 default。4.静态方法；5.私有方法(JDK9)。
 * 接口当中的抽象方法必须有2个固定关键字public,abstract,但是可以选择性省略。
 */

public interface NewInterface {
    //以下都是抽象方法
    public abstract void methodAbs();

    public void methodAbs2();

    abstract void methodAbs3();

    void methodAbs4();

}
