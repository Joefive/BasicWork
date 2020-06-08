package com.sunrise.day18;

import java.io.*;
import java.util.ArrayList;

/**
 * 序列化集合
 */

public class Demo11ObjectStreamArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<>();
        Person p1 = new Person("张一", 18);
        Person p2 = new Person("张二", 19);
        Person p3 = new Person("张三", 20);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\test\\ObjectStreamArrayList.txt"));
        oos.writeObject(arr);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test\\ObjectStreamArrayList.txt"));
        Object o = ois.readObject();
        ArrayList<Person> arr2 = (ArrayList<Person>) o;
        for (Person p : arr2) {
            System.out.println(p);
        }
    }
}
