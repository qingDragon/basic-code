package com.s0cket.day10.demo01;
/*
在任何版本的Java中，接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称();

注意事项：
1、接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2、这两个修饰符可以选择性省略（新手暂不推荐）
3、返回值类型、方法名称可以随意定义。
 */
public interface MyInterfaceAbstract {
    // 这是一个抽象方法，public abstract可以省略
    public abstract void method1();

    abstract void method2();

    public void method3();

    void method4();

}
