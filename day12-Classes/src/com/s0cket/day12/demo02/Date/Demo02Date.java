package com.s0cket.day12.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo();
    }

    /*
        Date 类不带参数构造方法
        public Date()  获取当前系统时间
     */
    private static void printDate1() {
        Date date = new Date();
        System.out.println(date); // Thu Dec 30 16:45:40 CST 2021  [CST china standard time]
    }
    /*
        Date类带参数构造方法
        public Date(long date)  传递的参数为long类型毫秒，把毫秒转化成日期
     */
    private static void printDate2() {
        Date date = new Date(0L);
        System.out.println(date); //Thu Jan 01 08:00:00 CST 1970
    }
    /*
        Date类的成员方法
        public long getTime() 将日期转换成毫秒
     */
    private static void demo() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time); // 1640854361913
    }
}
