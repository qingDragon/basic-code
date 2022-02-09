package com.s0cket.day13.demo03.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        // 创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        // 调用泛型方法
        gm.method1(1);
        gm.method1(0.8);
        gm.method1("hello");
        gm.method1(false);
        // 调用静态泛型方法
        gm.method2("hi");
        GenericMethod.method2(0.888);
    }
}
