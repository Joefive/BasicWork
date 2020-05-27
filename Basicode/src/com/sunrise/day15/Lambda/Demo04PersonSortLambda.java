package com.sunrise.day15.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04PersonSortLambda {
    public static void main(String[] args) {
        Person[] arr = {new Person("张一", 30),
                new Person("张二", 19),
                new Person("张五", 20),
                new Person("张三", 17)};
        //匿名内部类方式
         /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/


        //使用LAMBDA表达式处理该问题
        /*Arrays.sort(arr,(o1,o2)->{
            return o1.getAge() - o2.getAge();
        });*/

        Arrays.sort(arr, Comparator.comparingInt(Person::getAge));

        for (Person person : arr) {
            System.out.println(person + ";");
        }
        System.out.println("============================");

        invokeCalc(10, 20, new Calculate() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        //使用LAMBDA表达式
        invokeCalc(100, 200, (int a, int b) -> {
            return a + b;
        });
        //使用LAMBDA表达式
        invokeCalc(300, 300, (int a, int b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculate c) {
        int sum = a + b;
        System.out.println("sum=" + sum);
    }
}
