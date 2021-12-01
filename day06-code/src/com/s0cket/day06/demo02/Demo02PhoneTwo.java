package com.s0cket.day06.demo02;
/*
两个对象使用同一个方法的内存分析

 */
public class Demo02PhoneTwo {
    public static void main(String[] args) {
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

        Phone two = new Phone();

        System.out.println(two.brand);//null
        System.out.println(two.price);//0.0
        System.out.println(two.color);//null

        System.out.println("================");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);//三星
        System.out.println(two.price);//5999.0
        System.out.println(two.color);//蓝色
        System.out.println("================");

        two.call("欧巴");
        two.sendMessage();
    }
}
