package com.s0cket.day23.demo02.Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8 新加入的最常用的流接口。（这并不是一个函数式接口）
        获取一个流非常简单，有以下几种常用方式：
            所有的Collection集合都可以通过steam默认方法获取流
                default Stream<E> stream()
            Stream接口的静态方法of可以获取数组对应的流。
                static <T> Stream<T> of(T... values)
 */
public class Demo01GetStream {
    public static void main(String[] args) {
        // 把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        // 获取键，存储到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        // 获取值，存储到一个Collection集合中
        Collection<String> value = map.values();
        Stream<String> stream4 = value.stream();

        // 获取键值对（EntrySet）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream5 = entries.stream();

        // 把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5);

        // 可变参数传递数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);
    }
}
