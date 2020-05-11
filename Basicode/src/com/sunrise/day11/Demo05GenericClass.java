package com.sunrise.day11;

/**
 * 定义一个含有泛型的类，模拟ArrayList类
 * 类使用了泛型后，实例化对象的时候可以使用任意类型
 */

public class Demo05GenericClass {
    public static void main(String[] args) {
        //不写泛型默认是Object类型
        GenericClass gc = new GenericClass();
        gc.setName("张一");
        Object obj = gc.getName();
        System.out.println(obj);
        System.out.println("===============");

        GenericClass<Integer> gcInt = new GenericClass<>();
        gcInt.setName(369);
        int intNum = gcInt.getName();
        System.out.println(intNum);
        System.out.println("===============");

        GenericClass<String> gcStr = new GenericClass<>();
        gcStr.setName("张二");
        String name = gcStr.getName();
        System.out.println(name);
        System.out.println("===============");

        gc.genericMethod("哈哈");
        gc.genericMethod(123);
        gc.genericMethod(2.22);
        gc.genericMethod(true);
        System.out.println("===============");
        GenericClass.genericMethod02("中国");


    }
}
