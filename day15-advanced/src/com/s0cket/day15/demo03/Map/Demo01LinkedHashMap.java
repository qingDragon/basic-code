package com.s0cket.day15.demo03.Map;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map 接口的哈希表和链表实现，具有可预知的迭代顺序。
    底层原理：
        哈希表 + 链表 （记录元素的顺序）

 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("的","hal");
        hashMap.put("c","d");
        hashMap.put("d","e");
        hashMap.put("a","b");
        hashMap.put("b","c");



        System.out.println(hashMap);//{a=b, b=c, c=d, 的=hal, d=e} 无序的

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","b");
        linkedHashMap.put("b","c");
        linkedHashMap.put("的","hal");
        linkedHashMap.put("c","d");
        linkedHashMap.put("d","e");

        System.out.println(linkedHashMap);// {a=b, b=c, 的=hal, c=d, d=e} 有序的
    }
}
