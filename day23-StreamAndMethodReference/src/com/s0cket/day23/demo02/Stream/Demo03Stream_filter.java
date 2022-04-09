package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中常用方法filter:用于对流中的数据进行过滤
        Stream<T> filter(Predicate<? super T> predicate)
        filter方法的参数Predicate 是一个函数式接口，所以可以传递Lambda表达式，对元素进行过滤
        Predicate 中的抽象方法：
            boolean test(T t);
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        // 创建一个Stream流
        Stream<String> stream = Stream.of("赵无极", "赵晓", "张三丰", "张无忌", "张全蛋");
        // 对Stream中的元素进行过滤，只要姓赵的人
        Stream<String> stream2 = stream.filter(name -> name.startsWith("赵"));
        // 遍历流中的数据
        stream2.forEach(name -> System.out.println(name));

        /*
            Stream 流属于管道流，只能被消费（使用）一次
            第一个Stream流调用完毕方法，数据就会转到下一个Stream中
            第一个Stream流使用完毕，就会自动关闭，此时再调用它的方法，会报错
            java.lang.IllegalStateException: stream has already been operated upon or closed
         */
        // 遍历Stream流，报错
        stream.forEach(name -> System.out.println(name) );
    }
}
