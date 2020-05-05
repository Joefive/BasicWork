package com.sunrise.day09;

import com.sunrise.day09.packFour.*;

public class Demo05VariateClass {
    public static void main(String[] args) {
        Hero h = new Hero("张三",12,new Weapon("大砍刀"));
        h.hit();
        System.out.println("=======================");
        Hero hero = new Hero();
        hero.setName("三狗");
        hero.setAge(34);
        //weapon是对象，需要实例化进行赋值
        Weapon wp = new Weapon("波之武杖");
        hero.setWeapon(wp);
        hero.hit();
    }
}
