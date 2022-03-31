package com.s0cket.day14.demo01.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection接口

    List 特点：
    1、有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
    2、有索引，包含了一些带索引的方法
    3、允许存储重复的元素

    List接口中带索引的方法：
       -public void add(int index,E element):将指定的元素添加到该集合的指定位置
       -public E get(int index)  ：返回集合中指定位置的元素
       -public E remove(int index)：移除列表中指定位置的元素，返回该元素
       -public E set(int index,E element)：用指定元素替换集合中指定位置的元素，返回更新前的元素

    注意：操作索引的时候，一定要防止索引越界异常


 */
public class Demo01List {
    public static void main(String[] args) {
        // 使用多态创建一个集合
        List<String> list = new ArrayList<>();

        // 使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        // 打印集合中的元素
//        System.out.println(list);// [a, b, c, d, a] 不是地址重写了toString方法


        // -public void add(int index,E element):将指定的元素添加到该集合的指定位置
        // 在c和d之间添加元素"zhaoxiao"
        list.add(3,"zhaoxiao");
//        System.out.println(list);//[a, b, c, zhaoxiao, d, a]

        // -public E remove(int index)：移除列表中指定位置的元素，返回该元素
        String removeE = list.remove(2);
//        System.out.println(removeE);// c
//        System.out.println(list);// [a, b, zhaoxiao, d, a]

        // -public E set(int index,E element)：用指定元素替换集合中指定位置的元素，返回更新前的元素
        String setE = list.set(4, "A");
        System.out.println(setE);// a
        System.out.println(list);// [a, b, zhaoxiao, d, A]

        // list的遍历有三种方法
        // 第一种使用for循环索引遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===================");
        // 第二种：使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("=====================");

        // 第三种：增强for循环
        for (String s : list) {
            System.out.println(s);
        }
    }
}
