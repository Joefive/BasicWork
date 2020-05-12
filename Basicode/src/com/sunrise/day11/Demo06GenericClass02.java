package com.sunrise.day11;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型通配符?号,泛型通配符使用：实例化的时候不能使用?作为泛型类型，只能在传递参数的时候作为参数使用。
 * 泛型通配符?高级使用：泛型的上限限定，泛型的下限限定(了解)
 * 泛型上限限定：<? extends E> 代表只能用E类型的本身或者子类
 * 泛型下限限定：<? super E> 代表只能用E类型的本身或者父类
 */

public class Demo06GenericClass02 {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("张一");
        list01.add("张二");
        list01.add("张三");

        ArrayList<Integer> list02 = new ArrayList<>();
        list02.add(11);
        list02.add(22);
        list02.add(33);

        printArray(list01);
        System.out.println("===============");
        printArray(list02);
        System.out.println("===============");

        Collection<Integer> list03 = new ArrayList<>();
        Collection<Double> list04 = new ArrayList<>();
        Collection<Object> list05 = new ArrayList<>();
        Collection<Integer> list06 = new ArrayList<>();

        getElement1(list03); //Number本身及子类都可以
        getElement1(list04);
        getElement2(list05); //Number本身及父类



    }

    /**
     * 泛型通配符？方法(只能在参数中使用)
     * @param list
     */
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
    }

    public static void getElement1(Collection <? extends Number> coll){};
    public static void getElement2(Collection <? super Number> coll){};
}
