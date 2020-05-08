package com.sunrise.day10;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //使用反射技术进行判断
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name); //使用Objects的equals方法防止空指针异常
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 手动重写equals
     * @param obj
     * @return
     */
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof Person) { //判断类型是否是Person
//            //进行强制转型
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        return false;
//    }

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
