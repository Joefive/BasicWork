package com.sunrise.day09;


/**
 * Final关键可以可以修改：1.类；2.方法；3.成员变量；4.局部常量；
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        num = 20;
        System.out.println(num);

        //3.成员变量
        //一次复制终生不变
        final int num1 = 100;
        System.out.println(num1);

        //基本类型来说，不可变的数值；
        //引用类型来说，不可变的是引用的内存地址,对象地址不可变，但是可以调用里面成员方法来赋值
        Student st = new Student("张学友", 20);
        System.out.println("名字："+st.getName()+",年龄："+st.getAge());
        final Student st2 = new Student("Joefive",18);
        //st2 = new Student("张三",30);
        st2.setName("Mr.liu");
        System.out.println("名字："+st2.getName()+",年龄："+st2.getAge());


    }

}
