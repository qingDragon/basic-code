package com.s0cket.day06.demo02;
/*
一个对象的内存分析
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象

        Phone one = new Phone();

        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null

        System.out.println("================");

        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "黑色";
        System.out.println(one.brand);//苹果
        System.out.println(one.price);//8848.0
        System.out.println(one.color);//黑色
        System.out.println("================");

        one.call("乔布斯");
        one.sendMessage();
    }
}
