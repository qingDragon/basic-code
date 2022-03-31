package com.s0cket.day08.demo03;

/*
静态代码块的格式是：
public class 类名{
    static {
        // 静态代码块的内容
    }
}

特点：当第一次使用本类的时候，静态代码块执行唯一的一次。
静态内容总是优先于非静态，所以静态代码块比构造方法先执行。

静态代码块的典型用途：
用来一次性地对静态成员变量赋值。（后面JDBC中会讲到）

 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
