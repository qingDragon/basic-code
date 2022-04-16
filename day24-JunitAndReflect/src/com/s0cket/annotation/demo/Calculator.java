package com.s0cket.annotation.demo;
// 已有的计算器类，需要对其方法进行测试
public class Calculator {

    // 加法
    @Check
    public void add() {
        System.out.println("1 + 0 =" + (1+0));
    }

    // 减法
    @Check
    public void sub() {
        System.out.println("3 - 2 =" + (3-2));
    }

    // 乘法
    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1*0));
    }

    // 除法
    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1/0));
    }

    public void show(){
        System.out.println("永无bug...");
    }
}
