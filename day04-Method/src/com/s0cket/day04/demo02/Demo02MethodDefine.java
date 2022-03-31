package com.s0cket.day04.demo02;


/*
定义一个另个int数字相加的方法。三要素：
返回值类型：int
方法名称：sum
参数列表：int a, int b

方法的是三种调用格式
1、单独调用：方法名称（参数）;
2、打印调用:System.out.println(方法名称(参数));
3、赋值调用：数据类型 变量名称 = 方法名称(参数);

 注意：返回值类型为void的方法只能进行打印调用，不能进行赋值调用
 */

public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
