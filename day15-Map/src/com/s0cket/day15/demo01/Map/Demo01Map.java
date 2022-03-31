package com.s0cket.day15.demo01.Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
    1、Map 集合是一个双列集合，一个元素包含两个值（一个key,一个value)
    2、Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3、Map集合中的元素，key是不允许重复的，value是可以重复的
    4、Map集合中的元素，key和value是一一对应的

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点：
        1、HashMap集合底层是哈希表：查询的速度特别的快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
        2、hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点：
        1、LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
        2、LinkedHashMap是一个有序的集合，存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
        boolean containsKey(Object key)判断集合中是否包含指定的键。
        包含返回true，不包含返回false
     */
    private static void show04() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("杨过", 18);
        map.put("尹志平", 28);
        map.put("yanz", 38);

        boolean b1 = map.containsKey("yanz");
        System.out.println(b1); // true

        boolean b2 = map.containsKey("xi");
        System.out.println(b2); // false

    }


    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值：
            key存在，返回对应的value值
            key不存在，返回null
     */
    private static void show03() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("杨过", 18);
        map.put("尹志平", 28);
        map.put("yanz", 38);

        System.out.println(map);//
        Integer re = map.get("aha");
        System.out.println(re); //
    }
    /*
        public V remove(Object key):把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值：V
                key存在，返回被删除的值
                key不存在，返回null
     */
    private static void show02() {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        map.put("yanz", "zhaox");

        System.out.println(map);// {杨过=小龙女, 尹志平=小龙女, yanz=zhaox}
        String re = map.remove("杨过");
        System.out.println(re); // 小龙女

    }
    /*
        public V put(K key, V value):把指定的键与指定的值添加到Map集合汇总
            返回值V：
            存储键值对的时候，key不重复，返回值是null
                            key重复，会使用新的value替换map中重复的value，返回被替换的value值

     */
    private static void show01() {
        // 创建Map集合，多态
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        String v2 = map.put("李晨", "范冰冰2");

        System.out.println(v1); // null
        System.out.println(v2); // 范冰冰1

        System.out.println(map);
    }
}
