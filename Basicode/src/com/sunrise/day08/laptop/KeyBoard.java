package com.sunrise.day08.laptop;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void pressKey(){
        System.out.println("键盘输入方法！");
    }
}
