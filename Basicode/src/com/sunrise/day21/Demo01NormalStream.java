package com.sunrise.day21;

import java.util.ArrayList;

/**
 * 正常方式遍历集合
 */

public class Demo01NormalStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张一一");
        list.add("王二");
        list.add("李三");
        list.add("张五五");
        ArrayList<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }
        ArrayList<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length()==3){
                listB.add(s);
            }
        }
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
