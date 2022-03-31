package com.s0cket.day05.demo03;

/*
数组的索引编号从0开始，一直到“数组的长度-1”结束。


如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常。
ArrayIndexOutOfBoundsException

原因：索引编号写错了。
 */

public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15, 25, 35};

        System.out.println(array[0]);//15
        System.out.println(array[1]);//25
        System.out.println(array[2]);//35

//        System.out.println(array[3]);
    }
}
