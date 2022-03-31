package com.s0cket.day17.demo06.ThreadSafe;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    // 设置线程任务：卖票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复执行
        while(true) {
            // 先判断票是否存在
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName()+ "-->正在卖" + ticket + "张票");
                ticket -- ;
            }
        }
    }
}
