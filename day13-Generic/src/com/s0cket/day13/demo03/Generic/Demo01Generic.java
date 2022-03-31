package com.s0cket.day13.demo03.Generic;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/*
泛型：是一种未知的数据类型，当我们不知道使用什么数据类型的时候，可以使用泛型
泛型也可以看做是一个变量，用来接收数据类型

创建集合的时候，就会确定泛型的数据类型
 */
public class Demo01Generic {
    public static void main(String[] args) {
        demo02();
    }

    /*
        创建集合对象，不使用泛型
        优点：默认类型是Object类型，可以存储任意类型的数据
        缺点：不安全，会拋异常
     */
    private static void demo01(){
        ArrayList list = new ArrayList();
        list.add("abd");
        list.add(1);

        // 使用迭代器遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()) {
            // 取出元素是obj类型
            Object obj = it.next();
            System.out.println(obj);

            // 想要使用String特有的方法，需要向下转型
            // 会抛出异常 类型转换异常，不能将Integer对象转换成String对象

            String s = (String) obj;
            System.out.println(s);// java.lang.ClassCastException
        }
    }

    /*
        创建集合使用泛型
        优点：1、避免了类型装换的麻烦，存储的是什么类型，取出就是什么类型
             2、把运行期异常（代码运行之后会抛出异常）提升到了编译期
        缺点：泛型是什么类型，只能存储什么类型的数据

     */
    public static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abd");
        //list.add(1);// 编译器会报错'add(java.lang.String)' in 'java.util.ArrayList' cannot be applied to '(int)'
        list.add("cccd");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s+"->" +s.length());
        }
    }
}

