package com.s0cket.day12.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.Object 所有类结构的顶层，每个类都使用Object类的作为父类（超类）
所有对象（包含数组）都实现这个类的方法。

 */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
            Person类继承了Object类，所有可以使用Object类中的toString方法。
            String toString()  返回该对象的字符串表示
         */
        Person person = new Person("迪丽热巴", 18);
        String s = person.toString();
        System.out.println(s);
        // 直接打印对象名，其实就是在调用对象的toString方法
        System.out.println(person);

        /*
            看一个类是否重写了toString方法：直接打印这个对象的名称即可
                没有重写：打印出来的是对象的地址值
                重写之后：按照重写的内容进行打印

         */

        /*
        Random没有重写toString方法，打印出来的内容就是对象的地址值
         */
        Random r = new Random();
        System.out.println(r);// java.util.Random@36baf30c

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);// 重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);// [1, 2]  重写了toString方法
    }
}
