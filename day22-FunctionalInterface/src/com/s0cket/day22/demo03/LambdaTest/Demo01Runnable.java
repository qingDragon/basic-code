package com.s0cket.day22.demo03.LambdaTest;
/*
    例如：java.lang.Runnable接口就是一个函数式接口
    假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参
    这种情况其实和Thread类的构造方法参数为Runnable参数没有本质区别
 */
public class Demo01Runnable {
    public static void startThread(Runnable run){
        // 创建线程并启动
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用startThread方法，参数传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
            }
        });

        // 调用startThread方法，参数传递Lambda
        startThread(() -> {
            System.out.println(Thread.currentThread().getName()+ "-->" + "线程启动了");
        });

        // 优化Lambda
        startThread(() -> System.out.println(Thread.currentThread().getName()+"-->" + "线程启动了"));
    }
}
