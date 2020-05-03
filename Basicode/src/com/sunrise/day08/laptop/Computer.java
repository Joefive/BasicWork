package com.sunrise.day08.laptop;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机！");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机！");
    }

    //笔记本电脑接入设备，接入设备的参数是USB接扩，因为笔记本不知道他要接入的是什么设备，所以接口、抽象方法
    //如果笔记本电脑需要进行鼠标点击，键盘输入，需要进行向下转型，进行判断输入的usb是mouse还是keyboard
    public void useDiver(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.clickMouse();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.pressKey();
        }
        usb.close();
    }
}
