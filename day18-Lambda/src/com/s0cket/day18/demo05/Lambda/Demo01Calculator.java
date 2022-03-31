package com.s0cket.day18.demo05.Lambda;
/*
    Lambda表达式有参数有返回值的练习
    需求：
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        // 使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
        invokeCalc(120, 130, (int a, int b) ->{
                return a + b;
        });

        // 使用Lambda的简化格式计算12+13
        invokeCalc(12,13,(a,b)-> a+b);
    }
    /*
        定义一个方法
        参数传递两个int类型的整数
        参数传递Calculator接口
     */

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
