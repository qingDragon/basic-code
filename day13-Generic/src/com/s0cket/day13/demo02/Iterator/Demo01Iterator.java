package com.s0cket.day13.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator 接口迭代器（对集合进行遍历）
    两个常用方法：
        boolean hasNext() 判断集合中还有没有下一个元素，有返回true，没有则返回false

        E next() 取出集合中的下一个元素

    Iterator迭代器是一个接口，调用方法的话需要使用实现类对象
    Collection接口当中有一个方法，叫iterator(),这个方法的返回值就是Iterator实现类对象

    迭代器的使用步骤：
        1、使用Collection的itreator方法获取Iterator实现类对象
        2、使用hasNext方法判断有没有下一个元素
        3、使用next方法取出下一个元素

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        // 在集合中添加元素
        coll.add("姚明");
        coll.add("詹姆斯");
        coll.add("德布劳内");
        coll.add("德布劳内");
        coll.add("德布劳内");

        // 获取Iterator实现类对象
        Iterator<String> iterator = coll.iterator();
        // 使用while循环遍历
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============");
        Iterator<String> it = coll.iterator();
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(it.next());
        }
        
//        System.out.println(iterator.next()); // 集合中已经没有下一个元素了再调用next()抛出异常java.util.NoSuchElementException
    }
}
