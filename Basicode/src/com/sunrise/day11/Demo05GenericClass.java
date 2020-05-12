package com.sunrise.day11;

/**
 * 定义一个含有泛型的类，模拟ArrayList类
 * 类使用了泛型后，实例化对象的时候可以使用任意类型
 * 泛型接口的两种使用方法：
 * 1.通过实现类来实现泛型接口，可以在实现类中直接选择实现接口的泛型类型；
 * 2.通过实现类来实现泛型接口，可以在实现类中不定义泛型接口类型，实例化实现类对象的时候可以随机定义泛型类型；
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
        System.out.println("===============");

        //泛型接口
        GenericInterfaceImpl gif = new GenericInterfaceImpl();
        gif.method("泛型接口测试类");
        System.out.println("===============");

        GenericInterfaceImpl2<Integer> giiInt = new GenericInterfaceImpl2<>();
        giiInt.method(10);
        GenericInterfaceImpl2<Double> giiDou = new GenericInterfaceImpl2<>();
        giiDou.method(10.314);
        System.out.println("===============");
    }
}
