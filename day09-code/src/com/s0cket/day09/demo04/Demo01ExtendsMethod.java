package com.s0cket.day09.demo04;
/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就有限用谁，如果没有则向上找。

注意事项：
    无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();// 子类方法执行！
        zi.methodFu();// 父类方法执行！

        // 创建的是子类对象，所以优先调用子类方法
        zi.method();// 子类同名方法执行！
    }
}
