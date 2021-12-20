package com.s0cket.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }


    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAB() {
        System.out.println("覆盖重写了AB方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写了AB接口中的默认方法");
    }

}
