package com.s0cket.day10.demo07;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘USB");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘USB");
    }

    // 键盘独有的方法
    public void tap() {
        System.out.println("键盘敲击");
    }
}
