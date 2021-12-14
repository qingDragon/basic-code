package com.s0cket.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student("郭靖", 28);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);


        Student two = new Student("黄蓉", 18);

        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);


    }
}
