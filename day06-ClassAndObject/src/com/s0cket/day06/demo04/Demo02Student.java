package com.s0cket.day06.demo04;

public class Demo02Student {

    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造
        System.out.println("======");

        Student stu2 = new Student("赵丽颖", 20);//全参构造
//        System.out.println("姓名：" + stu2.name + "，年龄：" + stu2.age);//一旦类的成员变量变成private,就只能使用getter方法访问。
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        //如果需要改变对象当中的成员变量数据类容，仍然还需要使用setXxx方法
        stu2.setAge(21);//改变年龄
//        System.out.println("姓名：" + stu2.name + "，年龄：" + stu2.age);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());


    }
}
