package com.sunrise.day09.packFour;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.skill = skill;
    }

    public void hit() {
        System.out.println("年龄为" + age + "岁的英雄" + name + "已使用" + weapon.getCode() + "完成三杀；");
        skill.pull();
        System.out.println("本次攻击结束！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
