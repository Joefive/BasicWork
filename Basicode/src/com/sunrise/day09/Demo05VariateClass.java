package com.sunrise.day09;

import com.sunrise.day09.packFour.*;

/**
 * 1.对象可以作为方一个成员变量；
 * 2.接口也可以作为一个成员变量。
 */

public class Demo05VariateClass {
    public static void main(String[] args) {
        Hero h = new Hero("张三", 12, new Weapon("大砍刀"));
        SkillImpl sk = new SkillImpl(); //1.实现接口类方式
        h.setSkill(sk);
        h.hit();
        System.out.println("=======================");

        Hero hero = new Hero();
        hero.setName("三狗");
        hero.setAge(34);
        //weapon是对象，需要实例化进行赋值
        Weapon wp = new Weapon("波之武杖");
        hero.setWeapon(wp);
        Skill skill = new Skill() { //2.匿名内部类；
            @Override
            public void pull() {
                System.out.println("释放了【2】号技能！");
            }
        };
        hero.setSkill(skill);
        hero.hit();
        System.out.println("=======================");

        Hero h2 = new Hero();
        h2.setName("三狗");
        h2.setAge(36);
        h2.setWeapon(new Weapon("大宝剑"));
        h2.setSkill(new Skill() { //3.匿名对象方式
            @Override
            public void pull() {
                System.out.println("释放了【3】号技能！");
            }
        });
        h2.hit();
    }
}
