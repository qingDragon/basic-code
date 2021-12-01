package com.s0cket.day06.demo02;
/*
两个引用指向同一个对象的内存分析图
 */
public class Demo03PhoneSame {
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

        Phone two = one;

        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8848.0
        System.out.println(two.color);//黑色

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
