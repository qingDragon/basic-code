package com.s0cket.day18.demo02.Lambda;

/*
    有很多冗余的代码，我们并不是真的希望创建一个匿名内部类对象，我们真正想做的是传递一段代码

    jdk1.8之后的新特性，Lambda表达式的重量级新特性，为我们打开了新世界的大门。
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        // 第一种方法，创建Runnable接口的实现类对象
        Runnable run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        // 第二种方法,使用匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        };
        new Thread(r).start();

        // 第三种方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();
    }
}
