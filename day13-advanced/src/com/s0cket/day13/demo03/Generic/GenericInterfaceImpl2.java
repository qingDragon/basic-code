package com.s0cket.day13.demo03.Generic;

/*
    接口泛型的第二种实现方式：实现类仍然写泛型，在创建实现类对象的时候再指定泛型类型
 */
public class GenericInterfaceImpl2<I> implements GenericInterface <I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
