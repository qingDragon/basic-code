package com.s0cket.day23.demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用Stream流的方式遍历集合，对集合中的数据进行遍历
    Stream流是1.8之后出现的，关注的是做什么而不是怎么做
 */
public class Demo02Stream {
    public static void main(String[] args) {
        // 创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("玛尔扎哈");
        list.add("赵无极");
        list.add("赵晓");
        list.add("赵匡胤");

        // 对集合中的元素进行过滤，只要"赵"开头的元素，并存储到一个新的集合中
        // 对listA集合进行过滤，取出姓名长度为2的人，并存储到一个新的集合中
        // 遍历listB集合
        list.stream()
                .filter(name->name.startsWith("赵"))
                .filter(name-> name.length()==2)
                .forEach(name-> System.out.println(name));
    }
}
