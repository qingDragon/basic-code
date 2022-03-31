package com.s0cket.day10.demo01;
/*
注意事项：
不能通过接口实现类的对象来调用接口的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。

接口名称.静态方法名(参数)

 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl myInterfaceStatic = new MyInterfaceStaticImpl();

//        myInterfaceStatic.methodStatic();// 错误写法

        MyInterfaceStatic.methodStatic();// 静态方法的正确调用
    }
}
