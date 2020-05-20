package com.sunrise.day14;

/**
 * 1.自定义异常可以继承Exception，自行处理
 * 2.自定义异常可以继承RuntimeException，交给虚拟机
 * 3.自定义异常必须要有两个构造方法(空参构造方法，有参构造方法)
 */
public class CustomException extends Exception {
    public CustomException() {
    }

    //实际就是调用了Exception的异常信息
    public CustomException(String message) {
        super(message);
    }
}
