package com.s0cket.day17.demo01.getName;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        // 链式编程
        System.out.println(Thread.currentThread().getName());// main
    }
}
