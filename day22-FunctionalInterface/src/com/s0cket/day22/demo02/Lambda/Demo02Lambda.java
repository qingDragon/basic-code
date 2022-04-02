package com.s0cket.day22.demo02.Lambda;
/*
    使用Lambda优化日志案例
    Lambda的特点：延迟加载
 */
public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        // 判断当日志等级为1的时候，打印MessageBuilder接口的抽象方法的返回值
        if(level == 1) {
            System.out.println(mb.buildMessage());
        }
    }
    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        /*
            使用Lambda：
            如果日志等级不是1级，就不会执行MessageBuilder接口的抽象方法，也就不会拼接字符串，降低了资源的占用，提高效率。
         */
        showLog(2,()->{
            System.out.println("日志等级是1");
            return  msg1 + msg2 + msg3;
        });
        // 优化
        //showLog(1,()->msg1+msg2+msg3);
    }
}
