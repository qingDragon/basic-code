package com.s0cket.day19.demo02.Recursion;



/*
    递归：方法自己调用自己
     递归的分类：
        直接递归：自己调用自己
        间接递归：A调用B，B调用C，C调用A
     注意事项：
        递归必须要有终止条件
        次数不能太多
        构造方法禁止递归
     递归的使用前提：方法的主题不便，每次调用方法的参数不同
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        b(1);
    }
    // 构造方法禁止递归
    // 编译报错：构造方法创建对象使用的，一直递归会导致内存中有无数多个对象，直接编译报错
    public Demo01Recursion(){
//        Demo01Recursion();
    }


    //47407
    //Exception in thread "main" java.lang.StackOverflowError 栈溢出
    private static void b(int n) {
        if(n==100000) return;
        System.out.println(n);
        b( ++ n);
    }

    private static void a() {
        System.out.println("hello");
        a();
    }
}
