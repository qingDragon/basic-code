package com.s0cket.day19.demo02.Recursion;
/*
    练习：
        使用递归计算1-n之间的和
 */
public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(10);
        System.out.println("s=" + s);
    }
    /*
        定义一个方法，使用递归计算1-n之间的和
        使用递归必须明确：
        1、递归结束的条件
            读取到1
        2、递归的目的
            获取下一个被加的数字
     */
    private static int sum(int n) {
        // 结束条件
        if(n == 1) return 1;
        // 递归调用
        return n + sum(n-1);
    }
}
