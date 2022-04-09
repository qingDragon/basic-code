package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    如果要将流中的元素映射到另一个流中，可以使用map方法
        <R> Stream<R> map(Function<? super T,? extends R> mapper)
    该接口需要一个Function函数式接口参数，可以将流中的T类型数据，转换成另一种R类型数据的流
    Function中的抽象方法：
        R apply(T t);
 */
public class Demo04Stream_map {
    public static void main(String[] args) {
        // 获取一个Stream类型的流
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        // 使用Stream流中的map方法，将字符串类型的整数映射为Integer类型
        Stream<Integer> stream2 = stream.map(s -> Integer.parseInt(s));
        // 遍历stream2
        stream2.forEach(i-> System.out.println(i));
    }
}
