package com.s0cket.day10.demo01;
/*
从java8开始，接口中允许定义静态方法。

格式：
public static 返回值类型 方法名称(参数列表) {
    // 方法体
}

提示：就是将abstract或default关键字换成static关键字，带上方法体即可。

 */
public interface MyInterfaceStatic {
    public static void methodStatic() {
        System.out.println("这是接口的静态方法！");
    }
}
