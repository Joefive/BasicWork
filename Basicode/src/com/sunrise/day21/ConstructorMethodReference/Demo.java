package com.sunrise.day21.ConstructorMethodReference;

public class Demo {
    public static void main(String[] args) {
        printName("张一",(String name)->{
            return new Person(name);
        });

        //构造器的方法引用Person对象与构造器已知
        printName("张二",Person::new);
    }

    public static void printName(String name,PersonBuilder pb){
        Person p = pb.builderPerson(name);
        System.out.println(p.getName());
    }

}
