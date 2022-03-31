package com.s0cket.day04.demo04;


/*
在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
 */
public class Demo04OverloadPrint {

    public static void main(String[] args) {
        myPrint((byte)10);
    }

    public static void myPrint(byte num) {
        System.out.println("执行了byte参数方法");
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
