package com.s0cket.day06.demo02;
/*
当使用一个对象类型作为方法的返回值时，返回值其实就是对象的地址值。
 */
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "黑色";
        return one;
    }
}
