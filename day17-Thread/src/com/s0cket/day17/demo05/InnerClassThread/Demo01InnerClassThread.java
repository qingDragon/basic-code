package com.s0cket.day17.demo05.InnerClassThread;

import com.s0cket.day17.demo04.Runnable.RunnableImpl;

/*
    匿名内部类方式实现线程的创建

    匿名：没有名字
    内部类：写在其他类内部的类

    匿名内部类作用：简化代码（相当于新建了一个子类的对象，新建了一个接口实现类的对象）
        把子类继承父类，重写父类的方法，创建子类对象合成一步完成
        把实现实现类接口，重写接口中的方法，创建实现类对象合成一步完成
    匿名内部类的最终产物：子类/实现对象，而这个类没有名字

    格式：
        new 父类/ 接口(){
            重复父类/接口中的方法
        };
 */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        // 线程的父类是Thread
        // new MyThread().start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "赵晓");
                }
            }
        }.start();
        // 线程的接口Runnable
        // Runnable r = new RunnableImpl(); // 多态
        Runnable r = new Runnable() {
            // 重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "xiaozhao");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        // 链式编程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "zhao");
                }
            }
        }).start();

    }
}
