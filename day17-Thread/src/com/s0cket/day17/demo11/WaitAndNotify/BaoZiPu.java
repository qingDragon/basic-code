package com.s0cket.day17.demo11.WaitAndNotify;
/*
    生产者（包子铺）类是一个线程类，可以继承Thread
    设置线程任务（run）：生产包子
    对包子的状态进行判断
    true:
        有包子
        包子铺调用wait()方法进入等待状态
    false：没有包子
        包子铺生产包子
        增加一些趣味性：交替生产两种包子
            有两种状态(i%2== 0)
        包子铺生产好了包子
        修改包子的状态为true 有
        唤醒吃货线程，让吃货线程吃包子
    注意：
        包子铺线程和包子线程关系--> 通信（互斥）
        必须同时同步技术保证两个线程只能有一个再执行
        锁对象必须保证唯一，可以把包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
            1、需要在成员位置创建一个包子变量
            2、使用带参数构造方法，为这个包子变量赋值

 */
public class BaoZiPu extends Thread{
    // 1、在成员变量位置创建一个包子变量
    private BaoZi bz;
    // 2、使用带参数的构造方法为这个包子赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务（run）：生产包子
    @Override
    public void run() {
        // 定义一个变量
        int count = 0;

        while (true){
            // 必须使用同步技术保证两个线程只有一个在执行
            synchronized (bz) {
                // 对包子的状态进行判断
                if( bz.flag == true ) {
                    try {
                        // 调用wait方法进入等待状态
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，包子铺生产包子
                // 增加一些趣味性：交替生产两种包子
                if( count % 2 == 0) {
                    // 生产 薄皮三鲜馅的包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    // 生产 冰皮猪肉大葱馅的包子
                    bz.pi = "冰皮";
                    bz.xian = "猪肉大葱";
                }
                count ++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian+"的包子！");

                // 生产包子需要三秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 包子铺生产好了包子之后
                // 修改包子的状态为true
                bz.flag = true;
                // 唤醒吃货线程，让吃货线程吃包子
                bz.notify();//这个唤醒是不是唤醒的包子铺线程自己
                System.out.println("包子铺已经生产好了"+ bz.pi + bz.xian +"的包子，吃货可以来吃了");
            }
        }
    }
}
