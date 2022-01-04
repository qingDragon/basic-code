package com.s0cket.day12.demo05.System;


import java.util.Arrays;

/*
java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作。在System的API文档中，常用的方法有：
public static long currentTimeMillis()：返回以毫秒为单位的当前时间
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
将数组中指定的数据拷贝到另一个数组中
 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }
    /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
        将数组中指定的数据拷贝到另一个数组中
        Parameters:
            src - the source array.
            srcPos - starting position in the source array.
            dest - the destination array.
            destPos - starting position in the destination data.
            length - the number of array elements to be copied.
        练习：
        将src数组中的前三个元素，复制到dest数组的前三个位置。
        复制前：src:[1, 2, 3, 4, 5]  dest: [ 6, 7, 8, 9, 10 ]
        复制后：src:[1, 2, 3, 4, 5]  dest：[ 1, 2, 3, 9, 10 ]
     */
    private static void demo02() {
        // 定义源数组
        int[] src = { 1, 2, 3, 4, 5 };
        // 目标数组
        int[] dest = { 6, 7, 8, 9, 10 };

        // 复制前
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0,3);
        // 复制后
        System.out.println(Arrays.toString(dest));
    }


    /*
        public static long currentTimeMillis()：返回以毫秒为单位的当前时间
        作用：使用该方法记录程序运行时间

     */
    private static void demo01() {
        // 程序运行前计时
        long start = System.currentTimeMillis();
        // 打印1-9999
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        // 程序结束后计时
        long end = System.currentTimeMillis();
        System.out.println("打印1-9999时间：" + (end - start) + "毫秒");
    }
}
