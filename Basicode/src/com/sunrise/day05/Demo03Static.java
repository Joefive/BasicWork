package com.sunrise.day05;


/**
 * static来修饰成员变量，该成员变量将不再属于该对象，而是数据整个类
 * static来修改成员方法，该成员方法将不在属于该对象，属于整个类
 * 注意：1.成员方法可以访问成员变量、可以访问静态变量；
 * 2.静态方法不能访问非静态变量；内存中【先】产生静态内容，【后】产生非静态内容；
 * 3.静态不能使用this关键字。因为调用静态不需要new对象。
 */
public class Demo03Static {
    public static void main(String[] args) {
        Student st1 = new Student("张一",19);
        st1.room="101号教室";
        System.out.println("学号："+st1.getId()+"姓名："+st1.getName()+"年龄："+st1.getAge()+"教室："+st1.room);
        Student st2 = new Student("张二",20);
        System.out.println("学号："+st2.getId()+"姓名："+st2.getName()+"年龄："+st2.getAge()+"教室："+st2.room);
        System.out.println("=================");

        StaticMethod.methodStatic(); //推荐写法：类名+静态方法名
//        StaticMethod.method();    //非静态方法不new无法使用
//        StaticMethod st = new StaticMethod();
//        st.method();
//        st.methodStatic(); //不推荐写法

    }
}
