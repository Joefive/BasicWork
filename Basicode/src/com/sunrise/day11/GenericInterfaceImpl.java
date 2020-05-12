package com.sunrise.day11;

/**
 * 含有泛型的接口使用方式：1.使用是实现类
 */
public class GenericInterfaceImpl implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }

}
