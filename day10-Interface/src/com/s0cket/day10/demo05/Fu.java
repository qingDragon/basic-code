package com.s0cket.day10.demo05;

public class Fu {
    int num = 10;

    public void method() {
        System.out.println("父类方法");
    }
    public void showNum() {
        // 通过成员方法访问成员变量
        System.out.println(num);
    }

    public void methodFu() {
        System.out.println("父类独有方法！");
    }
}
