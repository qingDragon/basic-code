package com.s0cket.day10.demo03;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("默认方法A");
    }
}
