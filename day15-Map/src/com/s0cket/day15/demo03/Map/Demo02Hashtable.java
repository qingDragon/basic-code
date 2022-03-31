package com.s0cket.day15.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
    HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快

    HashMap(之前学过的所有集合）可以存储null值
    Hashtable集合不能存储 null值

    Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合（HashMap,ArrayList)所取代
    Hashtable的子类Properties依然活跃在历史舞台

    Properties集合是唯一一个和IO流结合的集合

 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        // 多态创建hashMap实例
        Map<String, String> map = new HashMap<>();
        map.put(null,"abc");
        map.put("hello",null);
        map.put(null,null);

        System.out.println(map);// {null=null, hello=null}

        Hashtable<String, String> hashtable = new Hashtable<>();
        //hashtable.put(null,"abc");// java.lang.NullPointerException
        //hashtable.put("abc", null);// java.lang.NullPointerException
        hashtable.put(null,null);// java.lang.NullPointerException
        System.out.println(hashtable);
    }
}
