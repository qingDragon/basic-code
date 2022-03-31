package com.s0cket.day19.demo02.Recursion;
/*
    练习：
        使用递归计算阶乘
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        long jc = jc(10);
        System.out.println(jc(6));
    }
    /*
        定义递归计算阶乘的方法
     */
    private static long jc(int n) {
        if(n ==1 ) return 1;
        return n*jc(n-1);
    }
}
