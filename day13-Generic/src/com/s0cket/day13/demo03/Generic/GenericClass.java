package com.s0cket.day13.demo03.Generic;

/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型：是一种未知的数据类型，当我们不知道使用什么数据类型的时候，可以使用泛型
    泛型可以接受任意的数据类型
    定义对象的时候确认泛型类别
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
