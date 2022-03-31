package com.s0cket.day09.demo09;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种。
1、在本类的成员方法中，访问本类的成员变量。
2、在本来的成员方法中，访问本类的另一个成员方法。
3、在本类的构造方法中，访问本类的另一个构造方法。
在第三种用法当中需要注意：
-  this(..)调用也必须是构造方法的第一个语句，唯一一个。
-  super 和 this两种构造调用，不能同时使用。
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
        this(10);// 本类的无参构造，调用本类的有参构造
    }

    public Zi(int n) {

    }

    public Zi(int n, int m) {
        this();
    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num);// 父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}