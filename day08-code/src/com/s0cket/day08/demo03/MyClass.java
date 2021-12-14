package com.s0cket.day08.demo03;
/*

 */
public class MyClass {

    int num;//成员变量
    static int numStatic;//静态变量
    public void method() {
        System.out.println("这是一个普通方法！");
        // 成员方法可以访问成员变量
        System.out.println(num);
        // 成员变量可以访问静态变量
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法！");
        // 报错，静态不能访问非静态
        //System.out.println(num);
        // 静态方法可以访问静态变量
        System.out.println(numStatic);
    }
}
