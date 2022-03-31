package com.s0cket.day15.demo04.JDK9;

import java.util.List;

/*
    JDK9的新特性：
        List接口、Set接口、Map接口：里面增加了一个静态的方法of,可以给集合一次性添加多个元素
        static <E> List <E> of (E...elements)
        使用前提：
            当集合中存储的元素个数已经确定了，不再改变时使用

        注意：
            1、of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
            2、of方法的返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，否则会抛出异常
            3、Set接口和Map接口在调用of方法的时候，不能有重复元素，否则会抛出异常
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d");

        System.out.println(list);
        list.add("e");// java.lang.UnsupportedOperationException
    }
}
