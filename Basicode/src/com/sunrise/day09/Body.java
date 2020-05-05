package com.sunrise.day09;

/**
 * 外部类身体
 */
public class Body {
    private String name;

    public Body(String name) {
        this.name = name;
    }

    public void methodBody() {
        System.out.println("身体的内部类!");
        //heart = new Heart();
        //heart.beat();
        new Heart().beat(); //使用匿名对象
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 成员内部类心脏
     */
    public class Heart {
        public void beat() {
            System.out.println("心脏蹦蹦跳...!");
            //可以调用外部类属性
            System.out.println("我叫" + name);
        }
    }
}
