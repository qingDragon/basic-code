package com.s0cket.day10.demo06;
/*
对象的向上转型：其实就是多态的写法
类似于自动类型转换。

向上转型一定是安全的，没有问题的，但是也有一个弊端：
对象一旦向上转型为父类，那么无法调用原来子类特有的内容

解决方案：用对象的向下转型

对象的向下转型：其实就是一个还原的动作，类似于强制类型转换。

格式：子类名称 对象名 = (子类名称) 父类对象
含义：将父类对象，【还原】成本来的子类对象

注意：
1、必须保证对象本来创建的时候就是猫，才能向下转型成为猫。
2、如果对象本来创建的时候不是猫，现在非要向下转型成为猫，就会报错。java.lang.ClassCastException

 */
public class Demo01Main {
    public static void main(String[] args) {
        // 对象的向上转型，就是父类引用指向子类对象
        // 本来是猫，向上转型为动物
        Animal animal = new Cat();

        animal.eat();// 猫吃鱼

//        animal.catchMouse();// 错误写法

        // 本来是猫，已经被当成动物了，还原回来成为本来的猫
        Cat cat = (Cat) animal;
        cat.catchMouse();

        // 下面是错误的向下转型
        // 本来new的时候就是一只猫，现在非要当成一只狗
        // 错误写法，编译不会出错，但是运行会出异常
        // java.lang.ClassCastException类转换异常
        Dog dog = (Dog) animal;
        dog.eat();

    }
}
