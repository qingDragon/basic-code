package com.s0cket.day09.demo01;
/*
面向对象的三大特征：封装性、继承性、多态性。
继承是多态的前提，如果没有继承，就没有多态。
继承主要解决的问题就是：共性抽取。

继承关系当中的特点：
1、子类可以拥有父类的"内容。
2、子类还可以拥有自己专有的内容。

在继承的关系中，"子类就是一个父类"。也就是说，子类可以被当做父类看待。
例如父类是员工，子类是讲师，那么"讲师就是一个员工"。关系：is-a。

定义父类的格式：（一个普通的类定义）
public class 父类名称 {
    // ...
}

定义子类的格式：
public class 子类名称 extends 父类名称 {
    // ...
}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // 创建一个子类对象
        Teacher teacher = new Teacher();
        // Teacher类当中虽然什么都没写，但是会继承来自父类的method方法。
        teacher.method();

        // 创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
