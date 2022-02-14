package com.s0cket.day14.demo04.VarArgs;
/*
    可变参数：
        JDK1.5之后出现的新特性
        使用前提：
            当方法的参数列表数据类型已经确定，但是参数的个数不确定，可以使用可变参数

        使用格式：定义方法时使用
            修饰符 返回值类型 方法名（数据类型...变量名）{}
        可变参数的原理：
            可变参数的层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
            传递的参数可数，可以是0（不传递），1，2...多个

        可变参数的注意事项
            1、一个方法的参数列表，只能有一个可变参数
            2、如果方法的参数有多个，那么可变参数必须写在参数列表的末尾

        可变参数的特殊（终极）写法：
            public static void method(Object...obj){} 可以接收任意类型的参数
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
//        int i = add();
        int i = add(10,20,30,40,50);
        System.out.println(i);
    }

     /*
            定义计算（0-n)整数和的方法
            已知：计算整数的和，数据类型已经确定int
            但是参数的个数不知道，就可是使用可变参数

            add();会创建一个长度为0的数组 new int[0]
            add(10);会创建一个长度为1的数组 new int[]{10}
            add(10,20);会创建一个长度为2的数组 new int[]{10,20}
         */
    public static int add(int...arr){
//        System.out.println(arr);// [I@1540e19d 底层是个数组
//        System.out.println(arr.length);// 0

        // 定义一个初始化的变量，记录累加求和
        int sum = 0;
        // 遍历数组
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
}
