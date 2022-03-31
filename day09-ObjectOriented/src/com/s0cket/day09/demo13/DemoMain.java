package com.s0cket.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
//        Dog dog = new Dog();// 不能直接创建Dog对象
        Dog2Ha ha = new Dog2Ha();
        ha.sleep();
        ha.eat();

        System.out.println("===========");

        DogGolden dogGolden = new DogGolden();
        dogGolden.sleep();
        dogGolden.eat();
    }
}
