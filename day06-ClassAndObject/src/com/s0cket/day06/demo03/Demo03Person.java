package com.s0cket.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = -20;//直接访问private内容，错误写法！
//        person.setAge(-20);//数据不合理
        person.setAge(20);

        person.show();
    }
}
