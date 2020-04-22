package com.sunrise.day03;

/**
 *一个标准的Java Bean:1.使用private修饰符的成员变量；2.有参数、无参数构造方法；3.getXxx，setXxx方法；
 */

public class Student {
    private String name;
    private int age;
    private boolean male;

    public boolean isMale() { //对于基本数据类型boolean类型，他的getXxx方法必须写成isXxx。
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /**
     * 构造方法：构造方法是用来创建对象，在new对象的时候其实就是在调用构造方法
     * 1.构造方法名称与类名称相同；
     * 2.不需要些返回值void；
     * 3.构造方法不能return不能写具体的返回值；
     * 4.所有类都有构造方法，没变编写会默认创建一个构造方法；
     * 5.构造发放可以进行重载；
     */
    public Student(){
        System.out.println("Student无参数构造方法执行...!");
    }

    public Student(String name,int age){
        System.out.println("Student有参数构造方法执行...!");
        this.name = name;
        this.age = age;
    }

}
