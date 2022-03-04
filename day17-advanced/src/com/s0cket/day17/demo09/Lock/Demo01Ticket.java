package com.s0cket.day17.demo09.Lock;

public class Demo01Ticket {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        // 打印对象run
        System.out.println("run:" + run);
        // 创建3个Thread对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        // 调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
