package com.s0cket.day17.demo10.WaitAndNotify;
/*
    线程的几种状态：
    新建状态 new  至今尚未启动的线程处于这种状态
    阻塞状态 Blocked 具有cpu的执行资格，等待cpu控线时执行
    运行状态 Runnable 正在java虚拟机中执行的线程处于这种状态
    休眠（睡眠）状态 Timed_Waiting 放弃cpu的执行资格，cpu空闲，也不执行
    无限（永久）等待状态 Waiting 无限期的等待另一个线程来执行某一特定操作
    死亡状态 Terminated 已退出的线程处于这种状态


    进入到TimeWaiting（计时等待）有两种方式
    1、使用sleep(long m) 方法，在毫秒值结束之后，线程睡醒进入到Runnable/ Blocked状态
    2、使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/ Blocked状态

    唤醒的方法：
        void notify() 唤醒在此对象监视器上等待的单个线程。
        void notifyAll() 唤醒在此对象监视器上等待的所有线程
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();
        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 一直等着卖包子
                while (true) {
                    // 保证等待和唤醒的线程只有一个在执行，需要用到同步技术
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        // 调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();
        // 创建个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 一直等着卖包子
                while (true) {
                    // 保证等待和唤醒的线程只有一个在执行，需要用到同步技术
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        // 调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2开吃");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        // 创建一个老板线程（生产者）
        new Thread() {
            @Override
            public void run() {
                // 一直在做包子
                while(true) {
                    // 花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //  保证等待和唤醒的线程只有一个执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子了");
                        // 做好包子后，调用notify方法，唤醒顾客吃包子
//                        obj.notify();
                        // 调用notifyall，唤醒所有wait的线程
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
