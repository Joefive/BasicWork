package com.sunrise.day15.Ticket;

public class TicketSell {
    public static void main(String[] args) {
        RunnableImpl ri = new RunnableImpl();
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);
        t1.start();
        t2.start();
        t3.start();
    }
}
