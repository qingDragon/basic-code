package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法：skip 用于跳过元素。 如果希望跳过前几个元素，可以使用skip方法来截取获得一个新的流
        Stream<T> skip(long n)
    如果流的长度大于n，则会返回一个截取后的新流，否则会返回一个长度为0的空流

 */
public class Demo07Stream_skip {
    public static void main(String[] args) {
        // 获取一个新的流
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼");
        // 使用skip方法截跳过三个元素
        Stream<String> stream2 = stream.skip(3);
        // 遍历stream2
        stream2.forEach(name-> System.out.println(name));
    }
}
