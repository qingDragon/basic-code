package com.s0cket.day23.demo02.Stream;

import java.util.stream.Stream;

/*
    forEach方法：用来遍历流中的数据
    是一个终结方法，调用之后就不能继续调用Stream中的其他方法了
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        // 获取一个Stream流
        Stream<String> stream = Stream.of("迪丽热巴", "玛尔扎哈", "打铁赵晓");
        // 使用Stream流中的forEach方法对流进行遍历
        stream.forEach(name -> System.out.println(name));// 简化写法
    }
}
