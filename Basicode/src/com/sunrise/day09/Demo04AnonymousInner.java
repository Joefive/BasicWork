package com.sunrise.day09;

/**
 * 匿名内部类：
 * 如果接口的实现(或者是父类的子类)，只需要实例化一次，那么可以使用匿名内部类
 * 注意：1.匿名内部类在创建的时候只能使用一次，再次使用需要再次创建；
 *      2.匿名对象:在调用方法的时候只能使用唯一一次；
 *      3.匿名内部类是省略了【实现类&子类】，匿名对象是省略了【对象名称】;
 */

public class Demo04AnonymousInner {
    public static void main(String[] args) {
        //多态写法
        MyInterface inter = new MyInterfaceImpl();
        inter.methodA();
        //匿名内部类写法,与上面相同
        MyInterface my = new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("匿名内部类重写了A-1");
            }
            @Override
            public void methodB() {
                System.out.println("匿名内部类重写了A-2");
            }
        };
        my.methodA();
        my.methodB();
        System.out.println("===================");

        /**
         * 匿名内部类，匿名对象
         */

        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("匿名内部类重写了B-1");
            }
            @Override
            public void methodB() {
                System.out.println("匿名内部类重写了B-2");
            }
        }.methodB();
        System.out.println("===================");
        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("匿名内部类重写了B-1");
            }
            @Override
            public void methodB() {
                System.out.println("匿名内部类重写了B-2");
            }
        }.methodA();
        System.out.println("===================");

    }
}
