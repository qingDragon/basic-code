package com.s0cket.day17.demo04.Runnable;
/*
    创建多线程的第二种方法：实现Runnable接口
    java.lang.Runnable
        Runnable接口应该由那些打算通过某一线程执行其实例来实现，类必须定义一个称为run的无参数方法
    java.lang.Thread类的构造方法
        Thread(Runnable target) 分配新的Thread 对象
        Thread(Runnable target,String name) 分配的Thread对象。

    实现步骤：
    1、创建一个Runnable接口的实现类
    2、在实现类中重写Runnable接口的run方法，设置线程任务
    3、创建一个Runnable接口的实现类对象
    4、创建Thread类对象，构造方法中传递Runnable接口的实现类对象
    5、调用Thread类中start方法，开启新的线程执行run方法

    总结：
    实现Runnable接口比继承Thread类所具有的的优势
    1、适合多个相同的程序代码的线程去共享同一个资源
    2、可以避免java中的单继承的局限性
    3、增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立
    4、线程只能放入实现Runnable和Callable类线程，不能直接放入继承Thread的类

 */
public class Demo01Runnable {
    public static void main(String[] args) {
        // 3、创建一个Runnable接口的实现类对象
        RunnableImpl ri = new RunnableImpl();
        // 4、创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(ri);
        // 5、调用Thread类中的start方法，开启新的线程执行run方法
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
