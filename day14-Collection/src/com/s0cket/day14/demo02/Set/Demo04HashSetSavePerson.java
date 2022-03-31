package com.s0cket.day14.demo02.Set;
/*
    HashSet存储自定义类型元素

    set集合保证元素唯一：
        存储的元素（String，Integer，...Student, Person...)，必须重写hashCode()方法和equals()方法

    要求：同名同年龄的人，视为同一个人，只能存储一次

 */
import java.util.HashSet;

public class Demo04HashSetSavePerson {
    public static void main(String[] args) {
        // 创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",18);
        Person p2 = new Person("小美女",18);
        Person p3 = new Person("小美女",19);

        // 重写完hashCode方法后，两个哈希值相等
        System.out.println(p1.hashCode());// 356573597
        System.out.println(p2.hashCode());// 1735600054

        System.out.println(p1 == p2); // false

        System.out.println(p1.equals(p2));// false 重写完equals方法后返回true

        set.add(p1);
        set.add(p2);
        set.add(p3);

        // 重写完hashCode方法和equals方法后，p1和p2重复，只能添加一个
        System.out.println(set);// [Person{name='小美女', age=18}, Person{name='小美女', age=18}, Person{name='小美女', age=19}]
    }
}
