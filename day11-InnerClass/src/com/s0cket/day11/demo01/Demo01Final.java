package com.s0cket.day11.demo01;

/*
final关键字代表最终，不可改变的

常见用法：
1、修饰一个类
2、修饰一个方法
3、修饰局部变量
4、修饰成员变量

 */
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num = 20;
        System.out.println(num);
        // 一旦使用final关键字来修饰成员变量，那么这个变量就不能进行更改
        // 一次赋值，终生不变
        final int num2 = 30;
        System.out.println(num2);
        // 错误写法
//        num2 = 30;

        // 正确写法，只能进行一次赋值
        final int num3;
        num3 = 200;

        System.out.println("==========================");
        // 对于基本类型来说，不可变说的是变量中的数据不可变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("赵又廷");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("高圆圆");
        System.out.println(stu2.getName());

        // 错误写法，final引用类型变量，其中的地址不可改变
//        stu2 = new Student("高圆圆圆圆");

        stu2.setName("高圆圆圆圆");
        System.out.println(stu2.getName());// 高圆圆圆圆
    }
}
