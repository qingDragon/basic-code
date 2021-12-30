package com.s0cket.day12.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        直接打印对象的地址值没有意义，需要重写Object类的toString方法。
        打印对象的属性(name, age)

     */
    @Override // 和构造方法、getter、setter方法一样，由IDE自动生成
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        Object类的equals方法比较是两个对象的地址值，没有意义
        需要重写该方法，来比较对象的属性值。

        问题：隐含多态
        Object obj = new Person("古力娜扎", 18);
        多态弊端：无法使用子类特有的属性、方法
        解决：向下转型（强转）
     */

    @Override
    public boolean equals(Object o) {
        // 如果传入的对象是调用方法的对象自己，直接返回，提高效率
        if (this == o) return true;
        //                判断o的类型与调用方法的对象类型不一致
        if (o == null || getClass() != o.getClass()) return false;// 反射，后面学
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
