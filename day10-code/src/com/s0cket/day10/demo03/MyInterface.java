package com.s0cket.day10.demo03;

import com.s0cket.day10.demo02.MyInterfaceB;

/*
1、类与类之间时单继承的，直接父类只有一个。
2、类与接口之间时多实现的，一个类可以实现多个接口。
3、接口与接口之间时多继承的。

注意事项：
1、多个父接口当中的抽象方法如果重复，没关系。
2、多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写。【而且带着default关键字】
 */
public interface MyInterface extends  MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("重写了A和B中同名的默认方法");
    }
}
