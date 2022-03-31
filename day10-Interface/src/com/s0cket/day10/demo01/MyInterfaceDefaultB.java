package com.s0cket.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("重写了默认方法");
    }
}
