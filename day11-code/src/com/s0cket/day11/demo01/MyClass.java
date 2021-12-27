package com.s0cket.day11.demo01;

/*
当final关键字修饰一个类时，格式：
public final class 类名称 {
    // ...
}

含义：这个类不能有任何的子类（太监类）

注意：如果一个类是final的，那么他的任何成员方法都不能被覆盖重写，因为它没儿子。

 */
public final class MyClass {
    public void method() {
        System.out.println("方法执行！");
    }
}
