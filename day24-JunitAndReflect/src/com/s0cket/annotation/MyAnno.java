package com.s0cket.annotation;



public @interface MyAnno {
    /**
     * 属性的返回值有以下类型：
     * 基本数据类型
     * 枚举
     * 注解
     * 字符串
     * 以及上述四种类型的数组类型
     */
    int value();
    Person per();
    MyAnno2 anno2();
    String[] strs();
}
