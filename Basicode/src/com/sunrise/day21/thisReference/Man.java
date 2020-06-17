package com.sunrise.day21.thisReference;

public class Man {
    public static void main(String[] args) {
        new Man().soHappy();
    }

    public void buyHouse(){
        System.out.println("Man:曲江买了一栋别墅...!");
    }
    public void marry(Richable r){
        r.buy();
    }
    public void soHappy(){
        /*marry(()->{
            this.buyHouse();
        });*/
        marry(this::buyHouse);
    }

}
