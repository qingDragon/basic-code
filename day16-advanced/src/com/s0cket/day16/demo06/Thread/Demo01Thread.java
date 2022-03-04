package com.s0cket.day16.demo06.Thread;
/*
    创建多线程程序的第一种方式：创建Thread类的子类
    java.lang.Thread:是描述线程的类，要实现多线程，必须继承Thread类

    实现步骤：
        1、创建一个Thread类的子类
        2、在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
        3、创建Thread类的子类对象
        4、调用Thread类中的方法start，开启新的线程，执行run方法
            void start() 使线程开始执行；Java虚拟机调用该线程的run方法。
            该线程和主线程并发运行；该线程执行run方法
          注意：多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动
       Java程序属于抢占式调度，哪个线程的优先级高，哪个线程有限执行，同一个优先级，随机选择一个执行

 */
public class Demo01Thread {
    public static void main(String[] args) {
        //3、创建Thread类的子类对象
        MyThread myThread = new MyThread();
        //4、调用Thread类中的方法start，开启新的线程，执行run方法
        myThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
