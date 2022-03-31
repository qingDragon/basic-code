package com.s0cket.day04.demo04;

/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。
方法的重载（overload）：多个方法的名称一样，但是参数列表不一样。
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。

方法重载与下列因素有关：
1、参数个数不同
2、参数类型不同
3、参数多类型顺序不同

方法重载与下列因素无关：
1、与参数名称无关
2、与方法的返回值无关

 */

public class Demo01MethodOverload {
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,10,20));
        System.out.println(sum(10,10,10,20));



    }

    public static int sum(int a, int b) {
        System.out.println("有两个参数的方法执行！");
        return a + b;
    }


    public static int sum(int a, int b, int c) {
        System.out.println("有三个参数的方法执行！");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有四个参数的方法执行！");
        return a + b + c + d;
    }
}
