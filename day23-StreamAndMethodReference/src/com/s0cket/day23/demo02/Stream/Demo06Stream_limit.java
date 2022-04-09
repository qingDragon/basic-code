package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法limit: 用于截取流中的元素 。可以对流中的数据元素进行截取，只取前n个。
        Stream<T> limit(long maxSize)
        limit 方法是一个延迟方法，对流中的元素进行截取返回一个新的流

 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        // 获取一个新的流
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼");
        // 使用limit方法截取前三个元素
        Stream<String> stream2 = stream.limit(3);
        // 遍历stream2
        stream2.forEach(name-> System.out.println(name));
    }
}
