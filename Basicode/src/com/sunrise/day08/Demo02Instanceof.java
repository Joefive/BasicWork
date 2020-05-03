package com.sunrise.day08;

/**
 * 向下转型格式：子类 子类名称=new
 * 向下转型需要使用instanceof关键字，可以追溯子类是谁，判断得出boolean值
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        givePet(new Dog());
    }
    public static void givePet(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catWalk();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.catchMouse();
        }
    }
}
