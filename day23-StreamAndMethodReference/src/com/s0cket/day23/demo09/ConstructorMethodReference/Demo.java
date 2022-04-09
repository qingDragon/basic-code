package com.s0cket.day23.demo09.ConstructorMethodReference;
/*
    类的构造器使用方法引用
 */
public class Demo {
    // 定义一个方法，传递String类型的姓名和函数式接口
    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.buildPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        // 调用printName方法
        printName("赵晓",(name)->{
            return new Person(name);
        });

        /*
            使用方法引用优化：Person已知，构造方法 new Person(String name)已知
         */
        printName("赵晓", Person::new);
    }
}
