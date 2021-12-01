package com.s0cket.day05.demo03;


/*
遍历数组：说的就是对数组当中的每一个元素进行逐一、挨个儿处理。默认的方式就是打印输出。
 */

public class Demo04Array {


    public static void main(String[] args) {
        int[] array = { 15, 25, 30, 40, 50 };

        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("============");


        //使用循环，次数其实就是数组的长度。
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==============");


        //长度  array.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
