package com.s0cket.day06.demo03;

/*
private关键字可以提高我们代码的安全性，利用setter，getter方法
 */
public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们：" + stu.isMale());
    }

}
