package com.s0cket.day10.demo01;

public class Demo04Interface {
    public static void main(String[] args) {
//        MyInterfacePrivateAImpl a = new MyInterfacePrivateAImpl();
//        a.methodAnother();
        MyInterfacePrivateB.methodStaticA();
        MyInterfacePrivateB.methodStaticB();
        
        // 错误写法！
//        MyInterfacePrivateB.methodStaticCommon();

    }
}
