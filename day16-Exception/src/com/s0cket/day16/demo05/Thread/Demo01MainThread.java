package com.s0cket.day16.demo05.Thread;
/*
    主线程：执行主（main）方法的线程

    Java执行main方法会进入到栈内存
    JVM会找到操作系统开辟一条mian方法铜线cpu的执行路径
    cpu就可以通过这个路径来执行main方法
    而这个路径有一个名字，叫main（主）线程


    线程调度分为分时调度和抢占式调度

    并发和并行的概念：
    并发：两个或多个事件在同一时间段内发生
    并行：两个或多个事件在同一时间发生

    线程和进程的概念：
    线程属于进程，是进程中的一个执行单元，负责程序的执行。

 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("赵晓");
        p1.run();

        Person p2 = new Person("小赵");
        p2.run();
    }
}
