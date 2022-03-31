package com.s0cket.day17.demo07.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的一种方案：使用同步代码块

    格式：
        synchronized(锁对象){
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }

    注意：
    1、通过代码块中的锁对象，可以使用任意的对象
    2、但是必须保证多个线程使用的锁对象是同一个
    3、锁对象作用：
        把同步代码块锁住，只让一个线程在同步代码块中执行

    同步技术的原理：
    使用了一个锁对象，这个锁对象叫同步锁，也叫对象锁，也叫对象监视器
    3个线程一起抢夺CPU的执行权，谁抢到了谁执行run方法进行卖票
        t0抢到了cpu的执行权，执行run方法，遇到synchronized代码块
        这是t0会检查synchronized代码块是否有锁对象
        发现有，就会获取到锁对象，进入到同步中执行

        t1抢到了cpu的执行权，执行run方法，遇到synchronnized代码块
        这时t1会检查synchronized代码块是否有锁对象
        发现没有，t1就会进入到阻塞状态，会一直等待t0线程归还锁对象
        一直到t0线程执行完同步中的代码，才会把锁对象归还给同步代码块
        t1才能获取到锁对象进入到同步中执行

    同步的优缺点：
    同步保证了只有一个线程在同步中执行共享数据，保证了安全，程序频繁的判断锁，获取锁，释放锁，程序的效率会降低

    总结：同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步
 */
public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票源
    private int ticket = 100;
    // 创建一个锁对象
    Object obj = new Object();
    // 设置线程任务：卖票
    @Override
    public void run() {
        // 使用死循环，让卖票操作重复执行
        while (true) {
            // 同步代码块
            synchronized (obj) {
                // 先判断是否存在
                if(ticket > 0) {
                    // 提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
                    ticket -- ;
                }
            }
        }
    }
}
