package com.s0cket.day14.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法：
        public satic <T> void sort(List<T> list): 将集合中的元素按照默认规则排序

    注意:
        sort<List<T> list) 使用前提
        被排序的集合里存储的元素类必须实现Comparable，重写接口中的方法compareTo方法定义排序的规则

    Comparable接口的排序规则：
        自己（this) - 参数：升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);

        System.out.println(list01);// [1, 3, 2]

        // 默认是升序排序
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3]

        ArrayList<Person> list02 = new ArrayList<>();
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",20);
        Person p3 = new Person("赵五",9);

        Collections.addAll(list02,p1,p2,p3);
        System.out.println(list02);// [Person{name='张三', age=18}, Person{name='李四', age=20}, Person{name='赵五', age=9}]

        Collections.sort(list02);
        System.out.println(list02);// [Person{name='赵五', age=9}, Person{name='张三', age=18}, Person{name='李四', age=20}]
    }
}
