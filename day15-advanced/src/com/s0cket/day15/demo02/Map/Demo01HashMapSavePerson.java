package com.s0cket.day15.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*
    HashMap存储自定义类型的键值
    Map集合保证key是唯一的：作为key的元素，必须重写hashCode和equals方法，以保证key唯一。

 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        demo02();
    }

    /*
    HashMap存储自定义类型键值
    key:Person类型
        重写的hashCode方法和equals方法来保证key唯一
    value：String类型
        value可以重复
    */
    private static void demo02() {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三",18), "北京");
        map.put(new Person("张三",18), "南京");
        map.put(new Person("赵晓",22), "上海");

        // entrySet遍历
        Set<Map.Entry<Person, String>> entrySet = map.entrySet();
        for (Map.Entry<Person, String> entry : entrySet) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "====>" + value);
        }
    }

    /*
    HashMap存储自定义类型键值
    key:String类型
        String类重写的hashCode方法和equals方法可以保证key唯一
    value：Person类型
        value可以重复（同名同年龄的人视为同一个人）
    */
    private static void demo01() {
        // 多态创建map集合
        Map<String, Person> map = new HashMap<>();
        // 往map集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",22));
        map.put("南京",new Person("战友",12));
        map.put("北京",new Person("赵晓",18));
        
        // 使用keySet + 增强for循环遍历
        Set<String> keys = map.keySet();
        for (String key:
             keys) {
            System.out.println(key + "===>" + map.get(key));
        }
    }
}
