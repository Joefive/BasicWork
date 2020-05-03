package com.sunrise.day08;

/**
 * 多态的前提是先要被继承或者被实现【左父右子】
 * 例如：打印机有打印接口，打印接口被实现后可以进行黑白打印，也可以进行彩色打印。
 * 多态的写法：
 * 1.父类对象 对象名称 = new 子类对象();new的谁就调用谁的方法 ；也是向上转型
 * 2.接口对象 接口名称 = new 实现类对象();
 * 调用成员变量：等号【左边】是谁优先用谁，如果没有就向上找；
 * 调用成员方法：
 * 【编译看左边，运行看右边】：1.有没有方法先看左边，2.运行看右边如果有使用右边没有向上找
 */
public class Demo01Polymorphism {
    public static void main(String[] args) {
        Father fa = new Son();
        fa.method();
        //如果调用方法子类没有就可以调用父类方法
        fa.methodFu();
        System.out.println("fa.num="+fa.num);
//      System.out.println(fa.num2);
        //方法如果没有被子类覆盖重写，再向上寻找
        fa.showNum();
        //编译看左运行看右
        fa.show();

        //对象向上转型一定是安全的，狗向上转型成了动物，就是多态写法
        Animal an = new Dog();
        an.eat();
        //向下转型,向下转型必须要可追溯的，不可追溯会转型失败
        Dog dog = (Dog) an;
        dog.catchMouse();
        int num = (int)10.555555;
        int num1 = (int)0.555555;
        System.out.println(num1);

    }

}
