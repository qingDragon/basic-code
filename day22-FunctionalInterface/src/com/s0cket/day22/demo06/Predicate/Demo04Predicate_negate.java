package com.s0cket.day22.demo06.Predicate;

import java.util.function.Predicate;

/*
    需求：
    判断一个字符串，有两个判断的条件
    1、判断字符串的长度是否大于5,是返回false
    2、判断字符串的长度是否大于5,否返回true
    我们就可以使用!运算符来连接两个条件

    Predicate接口中有一个default方法negate，表示或者关系
    方法的源码就是用||逻辑运算符连接的。
 */
public class Demo04Predicate_negate {
    /*
        定义一个方法，方法的参数，传递一个字符串
        使用Predicate接口判断字符串的长度是否大于5
     */
    public static boolean checkString(String s, Predicate<String> pre) {
        //return !pre.test(s);
        // 使用negate方法
        return pre.negate().test(s);
    }
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "adds";
        // 调用 checkString方法，传递一个字符串和Lambda表达式
        boolean b = checkString(s, (String str) -> { // 加了取反后变成字符串的长度大于5返回false
            // 字符串的长度大于5返回true
           return str.length()>5;
        });
        System.out.println(b);
    }
}
