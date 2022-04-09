package com.s0cket.day23.demo06.StaticMethodReference;
/*
    通过类名引用静态方法
    类已经存在，静态成员方法也已经存在，可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    // 定义一个方法，方法的参数传递一个整数和一个函数式接口
    public static int method(int number, Calcable c) {
        return c.calcAbs(number);
    }

    public static void main(String[] args) {
        // 调用method
        int number = method(-10,(n) -> {
            return Math.abs(n);
        });
        System.out.println(number);
        /*
            使用方法引用优化：Math类是存在的，静态方法abs方法也是存在的
         */
        int number2 = method(-101,Math::abs);
        System.out.println(number2);
    }
}
