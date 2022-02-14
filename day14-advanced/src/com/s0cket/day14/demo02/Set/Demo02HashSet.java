package com.s0cket.day14.demo02.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.HashSet 实现了Set接口，由哈希表支持（实际上是HashMap的实例）
        除了包含Set接口的特点：
        1、元素是无序的。（存集合所说的序，是指元素存入集合的顺序，当元素存储顺序和取出顺序一致时就是有序，否则就是无序。）
        2、底层是哈希表结构，特点是查询的速度特别快
     此实现也不是同步的，使用了多线程。

 */
public class Demo02HashSet {
    public static void main(String[] args) {
        // 多态创建一个HashSet集合
        Set<String> hashSet = new HashSet<>();

        hashSet.add("helo");
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("5");
        hashSet.add("5");
        hashSet.add("喝了两");
        hashSet.add("文件访问了");
        hashSet.add("adfasd");
        hashSet.add("c");


        System.out.println(hashSet);

        // 使用迭代器遍历
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("============");
        // 使用增强for遍历
        for(String str : hashSet) {
            System.out.println(str);
        }
    }
}
