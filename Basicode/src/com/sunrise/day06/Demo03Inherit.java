package com.sunrise.day06;

/**
 * 继承解决：共性抽取；
 * 继承特点：1.Java是单继承，不能一个子类有多个父类。2.Java可以多级继承，子>父>爷，但是都称呼为父类，最顶层是Object类。
 * 子类会继承父类的属性；父类、基类、超类；子类、派生类；推荐使用父类、子类称呼。
 * 1.子类可以用用父类的内容；
 * 2.子类可以拥有自己的新内容；
 * 3.子类跟父类成员变量重名，优先使用子类成员变量,子类没有找父类，向上寻找；
 * 4.子类跟父类成员方法重名，谁new优先使用谁，向上寻找。
 * 5.Object类是所有父类的子类
 * 6.子类方法重写返回值必须小于等于父类方法的返回值(子类返回String父类就必须返回大于String例如Object)
 * 7.子类方法重写方法权限必须大于等于父类方法的权限(public>protected>default>private)
 */

public class Demo03Inherit {
    public static void main(String[] args) {
        Teacher tc = new Teacher();
        tc.method();
        Assistant as = new Assistant();
        as.method();
        System.out.println("tc.num=" + tc.num);
        System.out.println("================");

        //注释掉Teacher类中的num成员变量,会取父类中的同名num成员变量
        tc.methodTest();
        //引出super关键字，标识父类中成员变量
        tc.methodPublic();
        System.out.println("================");

        //方法重写override:方法名称相同，参数列表也相同，方法覆盖，方法覆写
        //方法重载overload:方法名称相同，参数列表不相同
        tc.method();
        System.out.println("================");

        //抽象类
        Demo06AbstractInherit ai = new Demo06AbstractInherit();
        ai.method();
        ai.normalMethod();

    }
}
