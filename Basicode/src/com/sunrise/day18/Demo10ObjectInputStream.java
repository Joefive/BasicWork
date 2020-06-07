package com.sunrise.day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo10ObjectInputStream {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\BAK\\objectOut.txt"));
        Object o = null;
        try {
            o = ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
        System.out.println((Person) o);
        System.out.println(((Person) o).getName() + ((Person) o).getAge());
    }
}
