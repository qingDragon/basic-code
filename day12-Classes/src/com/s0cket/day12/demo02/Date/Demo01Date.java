package com.s0cket.day12.demo02.Date;
/*
java.util.Date:表示日期和时间的类

类Date 表示特定的瞬间，精确到毫秒
毫秒值的作用：可以将时间和日期进行转换
注意：中国属于东八区，会把时间加上8小时
1970年1月1日 08:00:00

毫秒转换成日期：
    1 天 = 24 * 60 * 60 = 86400 秒 = 86400 * 1000 毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        // 获取从 【1970年1月1日 00:00:00 】至 【当前系统时间】共计多少毫秒
        System.out.println(System.currentTimeMillis());
    }
}
