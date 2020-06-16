package com.sunrise.day21.teamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02TeamTest {
    public static void main(String[] args) {
        //TEAM-ONE
        ArrayList<String> groupOne = new ArrayList<>();
        groupOne.add("张一一");
        groupOne.add("王二二");
        groupOne.add("韩三三");
        groupOne.add("赵四");
        groupOne.add("邱五五");
        Stream<String> streamOne = groupOne.stream().filter(s -> s.length() == 3).limit(3);

        //TEAM-TWO
        ArrayList<String> groupTwo = new ArrayList<>();
        groupTwo.add("李一");
        groupTwo.add("李二");
        groupTwo.add("韩八");
        groupTwo.add("张九");
        groupTwo.add("李十");
        Stream<String> streamTwo = groupTwo.stream().filter(s -> s.startsWith("李")).skip(2);

        Stream.concat(streamOne,streamTwo).map(s->new Person(s)).forEach(s-> System.out.println(s));
    }
}
