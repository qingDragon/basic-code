package com.s0cket.day13.demo03.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        // 接口泛型的第一种使用方法：定义实现类的时候指定泛型类别
        GenericInterfaceImpl1 gi = new GenericInterfaceImpl1();
        gi.method("hello");

        // 接口泛型的第二种使用方法：创建实现类对象的时候指定泛型类型
        GenericInterfaceImpl2<Double> gi2 = new GenericInterfaceImpl2();
        gi2.method(0.88);
    }
}
