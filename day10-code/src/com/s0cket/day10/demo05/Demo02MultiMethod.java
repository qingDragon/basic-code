package com.s0cket.day10.demo05;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，则优先用谁，没有则向上找。

口诀：编译看左边，运行看右边

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。


 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();
        // 编译看左边，左边父类方法有该方法，编译通过，
        // 运行的时候执行的是右边子类的method方法
        obj.method();
        // 编译看左边，左边父类方法有该方法，编译通过，
        // 运行的时候执行的顺序显示右侧子类，子类没有methodFu方法，向上找到父类的method父方法执行。
        obj.methodFu();
        // 编译看左边，左边父类中没有该方法，所以编译报错！
//        obj.methodZi();
    }
}
