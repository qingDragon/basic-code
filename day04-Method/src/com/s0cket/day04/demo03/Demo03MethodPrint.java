package com.s0cket.day04.demo03;

/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld。
 */
public class Demo03MethodPrint {

    public static void main(String[] args) {
        printCount(10);
    }

    /*
    三要素
    返回值类型：void
    方法名臣：printCount
    参数列表：到底要打印多少次。次数：int
     */

    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
    }
}
