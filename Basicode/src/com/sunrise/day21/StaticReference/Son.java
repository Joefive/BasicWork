package com.sunrise.day21.StaticReference;

public class Son extends Father {
    public static void main(String[] args) {
        new Son().show();
    }

    @Override
    public void sayHello() {
        System.out.println("Son : I Am Here..!");
    }

    public void method(Superable superable) {
        superable.great();
    }

    public void show() {
/*        method(()->{
            Father f = new Father();
            //调用父类SayHello()方法
            f.sayHello();
        });*/
        //使用Lambda
        //method(() -> super.sayHello());
        //直接用super来引用父类成员方法
        method(super::sayHello);
    }
}
