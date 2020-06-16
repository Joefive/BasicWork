package com.sunrise.day21.teamTest;

import java.util.ArrayList;

public class Demo01TeamTest {
    public static void main(String[] args) {
        //TEAM-ONE
        ArrayList<String> groupOne = new ArrayList<>();
        groupOne.add("张一一");
        groupOne.add("王二二");
        groupOne.add("韩三三");
        groupOne.add("赵四");
        groupOne.add("邱五五");
        //1.队伍1三个字姓名进入
        ArrayList<String> tempOne = new ArrayList<>();
        for (String s : groupOne) {
            if (s.length()==3) {
                tempOne.add(s);
            }
        }
        //2.队伍1筛选前3名
        ArrayList<String> teamOne = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teamOne.add(tempOne.get(i));
        }
        //TEAM-TWO
        ArrayList<String> groupTwo = new ArrayList<>();
        groupTwo.add("李一");
        groupTwo.add("李二");
        groupTwo.add("韩八");
        groupTwo.add("张九");
        groupTwo.add("李十");
        //3.队伍2中添加姓李的人员
        ArrayList<String> tempTwo = new ArrayList<>();
        for (String s : groupTwo) {
            if(s.startsWith("李")){
                tempTwo.add(s);
            }
        }
        //4.队伍2中不要前两个人,从第3个开始循环
        ArrayList<String> teamTwo = new ArrayList<>();
        for (int i = 2; i < tempTwo.size(); i++) {
            teamTwo.add(tempTwo.get(i));
        }
        //5.合并两个队伍
        ArrayList<String> teamAll = new ArrayList<>();
        teamAll.addAll(teamOne);
        teamAll.addAll(teamTwo);
        //6.根据姓名创建一个Person对象集合
        ArrayList<Person> p = new ArrayList<>();
        for (String s : teamAll) {
            p.add(new Person(s)); //Person p = new Person("哈哈");
        }
        //7.遍历Person集合对象
        for (Person person : p) {
            System.out.println(person);
        }

    }
}
