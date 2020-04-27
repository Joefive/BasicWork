package com.sunrise.day06;

public class Teacher extends Employee {
    int num = 200;
    int numMax = 666;
    public void methodTest() {
        System.out.println("子类方法中num:" + num);
    }
    public void methodPublic(){
        int numMax = 999;
        System.out.println("成员方法中numMax:"+numMax);
        System.out.println("类中成员变量numMax："+this.numMax);
        System.out.println("父类中numMax："+super.numMax);
    }
    @Override
    public void method(){
        System.out.println("子类method方法执行..!");
    }

}
