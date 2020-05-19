package com.sunrise.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 斗地主使用map集合版本，可以进行对牌排序
 * 1.准备牌；2.洗牌；3.发牌；4.排序；5.看牌；
 */

public class FitRichMan {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //1.准备牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String color : colors) {
            for (String number : numbers) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        //2.洗牌
        Collections.shuffle(pokerIndex);

        //3.发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) { //集合循环最后3次发给底牌
                last.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        //4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(last);
        //5.看牌
        lookPoker("刘德华",poker,player01);
        lookPoker("周润发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,last);
    }
    public static void lookPoker(String name,HashMap<Integer,String> hashMap,ArrayList<Integer> list){
        System.out.print(name+" : ");
        for (Integer integer : list) {
            String val = hashMap.get(integer);
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
