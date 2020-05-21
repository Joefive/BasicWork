package com.sunrise.day15;

public class ThreadName extends Thread {
    public ThreadName() {
    }

    public ThreadName(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        System.out.println("ThreadName == " + name);
    }
}
