package com.s0cket.day11.demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        // 创建内部类的实例
        // 格式：外部类名称.内部类名称 对象名称 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();

        obj.methodInner();// 30 20 10
    }
}
