package com.s0cket.day13.demo03.Generic;


public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");

        Object obj = gc.getName();
        System.out.println(obj);

        // 泛型类型为Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        // 泛型类型为String
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("泛型类型是String");
        String name2 = gc3.getName();
        System.out.println(name2);

    }
}
