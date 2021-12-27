package com.s0cket.day10.demo07;

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标打开USB");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭USB");
    }
    // 鼠标独有的方法
    public void click() {
        System.out.println("鼠标点击");
    }
}
