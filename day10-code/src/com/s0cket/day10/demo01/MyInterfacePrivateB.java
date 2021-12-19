package com.s0cket.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodStaticA() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStaticB() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
