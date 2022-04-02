package com.s0cket.day22.demo01.FunctionalInterface;
/*
    函数式接口的使用：一般作为方法的参数或者返回值类型
 */
public class Demo {
    // 定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        // 调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象/接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                // 函数式接口的内部类中重写方法的内容
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        // 调用show方法，方法的参数是一个接口，所以可以使用Lambda
        show(() -> {
            System.out.println("使用Lamda重写接口中的抽象方法");
        });

        // 简化Lambda
        show(() -> System.out.println("使用简化的Lambda重写接口中的抽象方法"));
    }
}
