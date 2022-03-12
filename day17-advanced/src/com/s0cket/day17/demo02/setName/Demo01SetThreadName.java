package com.s0cket.day17.demo02.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        // 使用构造方法创建自定义线程类实例
        MyThread mt = new MyThread("xiaozhao");
        System.out.println(mt.getName());// xiaozhao
        System.out.println(Thread.currentThread().getName());// main
    }
}
