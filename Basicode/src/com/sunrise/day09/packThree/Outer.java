package com.sunrise.day09.packThree;

/**
 * 如果出现内外部类变量重名，外部类可以使用外部类名称.this.变量名
 * 局部方法内部类：外部类的方法中new内部类，让该类只在此方法执行的时候才被实例化并调用对应方法
 */

public class Outer {
    int num = 10;

    //内部类
    public class Inner {
        int num = 20;

        public void method() {
            int num = 30;
            System.out.println(num); //30
            System.out.println(this.num); //20
            System.out.println(Outer.this.num); //10
        }
    }

    //局部方法内部类
    public void methodOuter(){
        class Inner{
            int num = 666;
            public void methodInner(){
                System.out.println("局部内部类运行了"+666);
            }
        }
        Inner in = new Inner();
        in.methodInner();
    }
}
