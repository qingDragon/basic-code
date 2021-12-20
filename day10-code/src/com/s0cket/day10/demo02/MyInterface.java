package com.s0cket.day10.demo02;

public interface MyInterface {
    //错误写法！，接口不能有静态代码块
//    static {
//
//    }
    // 错误写法，接口不能有构造方法
//    public MyInterface() {
//
//    }

    public default void method() {
        System.out.println("接口的默认方法");
    }
}
