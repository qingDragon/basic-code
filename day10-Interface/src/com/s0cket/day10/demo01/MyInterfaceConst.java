package com.s0cket.day10.demo01;

/*
接口也可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰

从效果上看，这其实就是接口的【常量】
格式：
public static final 数据类型 常量名称 = 数据值;

备注：
一旦使用final关键字进行修饰，说明不可改变。

注意事项：
1、接口中的常量，可以省略public static final关键字，不写但是还是默认具备这三个关键字功能。
2、接口中的常量，必须进行赋值，不可不赋值。
 */
public interface MyInterfaceConst {
    // 这其实就是个常量，一旦赋值，不可以更改。
    public static final int NUM_OF_MY_CLASS = 12;
}
