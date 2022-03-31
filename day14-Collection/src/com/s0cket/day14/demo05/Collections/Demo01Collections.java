package com.s0cket.day14.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法：
        public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        public static void shuffle(List<?> list) 打乱集合中元素顺序

 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 最后一个参数是可变方法
        Collections.addAll(list, "a","b","c","d","e");
        System.out.println(list);
        // 打乱集合中元素顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
