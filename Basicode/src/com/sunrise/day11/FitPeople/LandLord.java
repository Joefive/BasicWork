package com.sunrise.day11.FitPeople;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 斗地主需求分析：
 * 1.准备牌：一副牌54张，里面有大王、小王其他52张牌定义一个数组集合储存花色、定义一个集合储存牌号(JQK)，进行嵌套循环；
 * 2.洗牌：使用Collection静态方法static void shuffle((List)<?> list) 方法进行随机打乱集合中的元素顺序；
 * 3.发牌：一个人17张牌，剩余最后三张为底牌，索引%3，然后索引>=51纳入底牌；
 * 4.看牌：打印集合查看集合中元素；
 */
public class LandLord {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        //可以使用传统for循环，也可以使用增加for循环
/*        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                //System.out.println(colors[i]+numbers[j]);
                poker.add(colors[i]+numbers[j]);
            }
        }
        System.out.println(poker);*/
        for (String color : colors) {
            for (String number : numbers) {
                //System.out.println(color+number);
                poker.add(color + number);
            }
        }
        //System.out.println(poker);

        //2.洗牌,直接调用Collections类的静态方法shuffle()随机打乱集合顺序
        Collections.shuffle(poker);
        //System.out.println(poker);

        //3.发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> holeCards = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                holeCards.add(s);
            } else if (i % 3 == 0) {
                player01.add(s);
            } else if (i % 3 == 1) {
                player02.add(s);
            } else if (i % 3 == 2) {
                player03.add(s);
            }
        }

        //4.看牌
        System.out.println("刘德华："+player01);
        System.out.println("周润发："+player02);
        System.out.println("周星驰："+player03);
        System.out.println("holeCards："+holeCards);

    }
}
