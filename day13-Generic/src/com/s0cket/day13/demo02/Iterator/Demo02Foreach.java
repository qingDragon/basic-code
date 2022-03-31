package com.s0cket.day13.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写。
是JDK1.5之后出现的特性

public interface Collection<E> extends Iterable<E> ：所有的单列集合都可以使用增强for循环

public interface Iterable<T>：实现这个接口，允许对象成为"foreach"语句的目标。
Implementing this interface allows an object to be the target of the "for-each loop" statement.

增强for循环的作用：遍历数组和集合

 */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
    }
    // 使用增强for循环遍历集合
    private static void demo01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(String i : list){
            System.out.println(i);
        }

    }
}
