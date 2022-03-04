package com.s0cket.day17.demo03.sleep;

/*
    public static void sleep(long millis):使当前正在执行的线程以指定的毫秒暂停（暂时停止执行）

 */
public class Demo01Sleep {
    public static void main(String[] args) {
        // 模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            // 使用Thead类的sleep方法让程序睡眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
