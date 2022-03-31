package com.s0cket.day10.demo01;
/*
1、接口的默认方法，可以通过接口的实现类对象，直接调用。
2、接口的默认方法，也可以通过接口的实现类进行覆盖重写。
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();// 调用的是接口的默认方法

        System.out.println("=================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();// 调用的是实现类重写过的默认方法
    }
}
