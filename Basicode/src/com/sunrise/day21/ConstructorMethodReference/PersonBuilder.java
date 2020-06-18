package com.sunrise.day21.ConstructorMethodReference;

/**
 * 根据姓名来创建一个Person对象
 */

@FunctionalInterface
public interface PersonBuilder {
    //传入name返回Person对象
    Person builderPerson (String name);
}
