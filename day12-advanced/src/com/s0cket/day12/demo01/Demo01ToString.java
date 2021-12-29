package com.s0cket.day12.demo01;

public class Demo01ToString {
    public static void main(String[] args) {
        /*
            Person类继承了Object类，所有可以使用Object类中的toString方法。
            String toString()  返回该对象的字符串表示
         */
        Person person = new Person("迪丽热巴", 18);
        String s = person.toString();
        System.out.println(s);
        System.out.println(person);
    }
}
