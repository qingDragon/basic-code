package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    concate:用于把流组合到一起
        static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> stream = Stream.of("黄通", "任登宝", "郭子瑞", "徐超", "戴维斯");
        // 获取一个Stream流
        String[] arr = {"赵无极", "赵敏", "赵雷", "赵晓"};
        Stream<String> stream2 = Stream.of(arr);
        // 使用concate方法组合两个Stream
        Stream<String> concate = Stream.concat(stream,stream2);
        // 遍历流
        concate.forEach(name-> System.out.println(name));
    }
}
