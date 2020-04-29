package com.sunrise.day06.redPacket;

import java.util.ArrayList;

public class RedPacked {
    public static void main(String[] args) {
        Boss boss = new Boss("波西", 100);
        Worker one = new Worker("南波碗", 0);
        Worker two = new Worker("南波兔", 0);
        Worker three = new Worker("南波碎", 0);

        boss.show();
        one.show();
        two.show();
        three.show();
        System.out.println("================");

        ArrayList<Integer> redList = boss.send(20, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        boss.show();
        one.show();
        two.show();
        three.show();
        System.out.println("================");


    }
}
