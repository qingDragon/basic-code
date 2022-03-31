package com.s0cket.day14.demo01.List;

import java.util.LinkedList;

/*

java.util.LinkedList集合也实现了List接口，存储数据的结构是链表结构。方便元素添加、删除。
LinkedList是一个双向链表，实际开发中对一个集合元素的添加与删除经常涉及到首尾操作，而LinkedList提供了大量首尾操作的方法。

特点：
1、底层是一个链表结构，查询慢、增删快
2、里面包含了大量操作首尾元素的方法
3、使用LinedList集合特有的方法，不能使用多态 LinkedList<String> linked = new LinkedList<>();

特有方法：

public void addFirst(E e)
public void addLast(E e)
public E getFirst()
public E getLast()
public E removeFirst()
public E removeLast()
public E pop()
public void push(E e)
public boolean isEmpty()

注意事项：

linkedList.clear()清空集合中的元素，在获取集合中的元素会抛出NoSuchElementException异常
因此可以在获取元素之前加个判断：if(!linkedList.isEmpty())

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //创建LinkedList集合
        LinkedList<String> linkedList = new LinkedList<>();

    }
}
