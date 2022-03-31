package com.s0cket.day05.demo02;
/*
分析内存：栈、堆、方法区
 */
public class Demo03ArraySame {

    public static void main(String[] args) {
        int[] arrayA = new int[3];//动态初始化
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0

        System.out.println("=========================");


        //改变数组当中的元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20

        //将arrayA数组的地址值赋值给arrayB
        int[] arrayB = arrayA;
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0

        System.out.println("=========================");


        //改变数组当中的元素的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
    }
}