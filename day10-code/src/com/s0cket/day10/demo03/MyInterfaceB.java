package com.s0cket.day10.demo03;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault() {
        System.out.println("默认方法B");
    }
}
