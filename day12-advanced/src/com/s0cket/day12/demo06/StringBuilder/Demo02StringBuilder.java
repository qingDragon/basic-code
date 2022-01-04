package com.s0cket.day12.demo06.StringBuilder;

import java.util.Locale;

/*
    StringBuilder的成员方法：
        public StringBuilder append(...):添加任意类型数据的字符串形式，并返回对象自身。
        参数：
            可以是任意的数据类型。
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        // 使用append()方法往StringBuilder中添加数据。
        StringBuilder bu2 = bu1.append(1).append("hello").append(true).append(8.3);
        System.out.println(bu1 == bu2);// 比较两个对象，结果为ture
        System.out.println(bu2);// 1hellotrue8.3
        System.out.println(bu1);// 返回对象本身，无需接收返回值 ：1hellotrue8.3

        /*
            链式编程：
            方法的返回值是一个对象，可以根据对象继续调用方法。
         */
        System.out.println("abc".toUpperCase().toUpperCase().toLowerCase());
        System.out.println(bu1.append(1).append("hello").append(true).append(8.3));// 1hellotrue8.31hellotrue8.3
    }
}
