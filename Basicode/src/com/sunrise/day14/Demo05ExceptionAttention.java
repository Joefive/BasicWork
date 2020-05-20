package com.sunrise.day14;

import java.util.ArrayList;

/**
 * 1.多个异常分别处理，一个异常try...catch一次；
 * 2.多个异常一次捕获多次处理；【一次只能处理一个异常】
 *   注意：一个try多个catch，多个catch中的异常如果有子类、父类关系，必须子类写上面(多态，下面子类没用到)；
 * 3.多个异常一次捕获一次处理，一个异常对象可以包含多种异常。【一次只能处理一个异常】
 */

public class Demo05ExceptionAttention {
    public static void main(String[] args) {
        //1.多个异常多次处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(11);
            list.add(22);
            list.add(33);
            Integer integer = list.get(5);
            System.out.println(integer);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("######1.多个异常多次处理，执行完毕！######");

        //2.一次捕获多次处理
        try {
            int[] arr1 = {1, 2, 3};
            //System.out.println(arr1[4]);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(11);
            list2.add(22);
            list2.add(33);
            Integer integer = list2.get(5);
            System.out.println(integer);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("######2.一次捕获多次处理，执行完毕！######");

        //3.多个异常一次捕获一次处理
        try {
            int[] arr2 = {1, 2, 3};
            //System.out.println(arr2[4]);
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(11);
            list3.add(22);
            list3.add(33);
            Integer integer = list3.get(5);
            System.out.println(integer);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("######3.多个异常一次捕获一次处理，执行完毕！######");

        System.out.println("end:后续代码已执行！");
    }
}
