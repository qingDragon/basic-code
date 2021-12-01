package com.s0cket.day06.demo02;

/*
使用对象类型作为方法参数时，传递的其实是对象的地址。
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "黑色";

        method(one);
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }

}
