package com.s0cket.day13.demo03.Generic;
/*
    两种接口使用泛型的方式：
    1、实现类中确认泛型
    2、创建实现类对象的时候确认泛型

    定义含有泛型的接口
 */
public interface GenericInterface<I>{
    public abstract void method(I i);
}
