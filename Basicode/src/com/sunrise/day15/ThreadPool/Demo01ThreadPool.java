package com.sunrise.day15.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 容纳多个线程的容器，其中的线程可以反复使用，省略掉频繁创建线程的过程；
 * 优点：1.降低消耗，不用反复创建销毁线程，没个工作的线程可以被重复利用可执行多个任务；
 *      2.提高了响应速度，当任务到达时，任务不需要线程创建就能直接调用；
 *      3.提高线程的可管理性，根据系统承受能力调整线程数量，放置服务器down(一个线程大于消耗1MB内存)
 * 创建步骤：
 * 1.JDK1.5后提供了线程池类类Executors，调用创建线程池方法：newFixedThreadPool(int nThreads)创建；
 * 2.创建一个类，实例化Runnable接口并重写run()方法；
 * 3.调用ExecutorService中的方法submit，传递线程任务(实现类)，开启线程，执行run方法；
 * 4.调用ExecutorService中shutdown方法进行关闭(不建议执行)；
 */

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2); //多态
        RnnableImpl ri = new RnnableImpl();
        es.submit(ri);
        es.submit(ri);
        es.submit(ri);
    }
}
