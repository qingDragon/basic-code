package com.s0cket.day22.demo02.Lambda;
/*
    日志案例：
        发现代码存在性能浪费的问题
        不管传递的日志等级是不是1级，都会存在字符串拼接问题
 */
public class Demo01Logger {
    // 定义一个根据日志级别，显示日志信息的方法
    public static void showLog(int level, String message){
        // 对日志级别进行判断，如果级别是1，输出日志信息
        if(level == 1) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        // 调用showLog方法
        showLog(1,msg1+msg2+msg3);
    }

}
