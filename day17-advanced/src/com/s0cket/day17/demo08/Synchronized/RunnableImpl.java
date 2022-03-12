package com.s0cket.day17.demo08.Synchronized;
/*
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的第二种方案，使用同步方法
    使用步骤：
    1、把访问了共享数据的代码抽取出来，放到一个方法中
    2、在方法上添加synchronized修饰符
    格式：
        定义方法的格式
    修饰符 synchronized 返回值类型 方法名（参数列表） {
        可能会出现线程安全问题的代码（访问了共享数据的代码）
    }
 */
public class RunnableImpl implements Runnable{
    // 定义一个多线程共享的票源
    private static int ticket = 1000;
    // 设置线程任务：卖票
    @Override
    public void run() {
        // 打印调用run方法的锁对象
        System.out.println("this:"+ this);
        while (true){
            payTicketStatic();
        }
    }
    /*
        静态的同步方法
        锁对象是谁？
        不能是this
        this是创建对象之后产生的，静态方法有限于对象
        静态方法的锁对象是本类的class属性 --> class文件对象（反射）

     */
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl.class) {
            // 先判断是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
                ticket--;
            }
        }
    }
    /*
        定义一个同步方法
        同步方法也会把方法内部的代码锁住
        只让一个线程执行
        同步方法的锁对象是谁
        就是实现类对象 new RunnableImpl()
        也就是this
    */
    public /*synchronized*/ void payTicket(){
        synchronized (this) {
            // 先判断是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
                ticket--;
            }
        }
    }

}
