package com.s0cket.day10.demo01;

public interface MyInterfaceDefault {
    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("这是接口默认方法");
    }
}
