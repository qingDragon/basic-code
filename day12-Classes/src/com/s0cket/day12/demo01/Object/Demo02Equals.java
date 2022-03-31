package com.s0cket.day12.demo01.Object;

/*
Person 继承了Object类，所有可以使用Object类的equals方法
    public boolean equals(Object obj) 比较其他对象与当前对象是否"相等"
    源码：
    public boolean equals(Object obj) {
        return (this == obj);
    }
    参数：obj 需要和当前调用方法的对象进行比较的任意对象
    方法体：
        基本数据类型，比较的是数值
        引用数据类型，比较的是地址值
    this：哪个对象调用的equals方法，哪个对象就是this


 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("玛尔扎哈", 18);

        System.out.println(p1.equals(p2));// false
    }
}
