package com.s0cket.day18.demo02.Lambda;

/*
    匿名内部类的好处与弊端：
    省去了类的定义，但语法太复杂了

    Lambda表达式的标准格式：
        三部分组成
        1、一些参数
        2、一个箭头
        3、一段代码
        格式：
            （参数列表）-> {一些重写方法的代码};
        解释说明格式：
            ():接口中抽象方法的参数列表，没有参数，就空着；有参数就写出参数，多个参数使用都好隔开
            ->:传递的意思，把参数传递给方法体
            {}:重写接口的抽象方法的方法体
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();
        // 使用Lambda表达式创建多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"新的线程创建了");
        }).start();
    }
}
