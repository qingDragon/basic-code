package com.s0cket.day05.demo03;

/*
如何获取数组的长度，格式：
数组名称.Length

这将会得到一个int数字，代表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println(arrayC.length);//5

    }
}
