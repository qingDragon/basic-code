package com.s0cket.day07.demo05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历

 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("古天乐",12);
        Student stu2 = new Student("任贤齐",23);
        Student stu3 = new Student("赵文卓",34);
        Student stu4 = new Student("甄子丹",45);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + ", 年龄：" + list.get(i).getAge() );
        }
    }
}
