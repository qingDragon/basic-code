package com.s0cket.day13.demo03.Generic;

/*
    定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间

    含有泛型的方法，在调用泛型的时候确定泛型的数据类型
    传递什么类型的参数，泛型就是什么类型
 */
public class GenericMethod {
    public <M> void method1(M m){
        System.out.println(m);
    }
    public static <T> void method2(T t) {
        System.out.println(t);
    }
}
