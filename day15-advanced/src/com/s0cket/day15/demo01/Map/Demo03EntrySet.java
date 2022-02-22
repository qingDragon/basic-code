package com.s0cket.day15.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第二种方法：使用Entry对象遍历

    Map集中的方法
        Set<Map.Entry<k,v> entrySet() 返回此映射中包含的映射关系的Set视图
    实现步骤：
        1、使用Map集合汇总的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        2、遍历Set集中，获取每一个Entry对象
        3、使用Entry对象中的getKey() 和getValue() 获取键与值

 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("杨过", 18);
        map.put("尹志平", 28);
        map.put("yanz", 38);

        //1、使用Map集合汇总的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // 使用迭代器遍历Set集合
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            // 3、使用Entry对象中的getKey() 和getValue() 获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        // 也可使用增强for循环进行遍历

    }
}
