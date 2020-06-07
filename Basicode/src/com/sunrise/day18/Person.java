package com.sunrise.day18;

import java.io.Serializable;

/**
 * transient关键字不能被序列化，例如不想让银行卡号或者密码等字段写入的时候使用
 */

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; //反序列化时候不会出现UID不一致
    private String name;
    //private transient int age;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
