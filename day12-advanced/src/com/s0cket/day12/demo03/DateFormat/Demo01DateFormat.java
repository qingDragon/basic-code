package com.s0cket.day12.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat:是日期/时间格式化子类的抽象类
    作用：
        格式化（日期 -> 文本） 解析（文本 -> 日期）
    成员方法：
        String format(Date date) 按照指定的模式，把Date日期，格式化成符合模式的字符串
        Date parse(String source) 把符合模式的字符串解析成Date日期
    DateFormat 是抽象类，无法直接创建对象使用，可以使用其子类
        java.text.SimpleDateFormat extends DateFormat

        构造方法：
        SimpleDateFormat(String pattern) 用给定的格式和默认语言环境的日期格式符号构造 SimpleDateFormat
            参数：String pattern 传递指定的格式
            格式：区分大小写
            y-年 M-月 d-日 H-时 m-分 s-秒

            写对应的格式，会把格式替换为对应的日期时间
                "yyyy-MM-dd HH:mm:ss"
                "yyyy年MM月dd日 HH时mm分ss秒"
            注意：格式中的字母不能改，连接的符号可以改


 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }
    /*
        使用DateFormat中的方法format 把日期格式化为字符串
        String format(Date date) 按照指定的模式，把Date日期，格式化成符合模式的字符串
        使用步骤：
            1、创建SimpleDateFormat对象，构造方法中传入指定的模式作为参数
            2、调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化成符合模式的字符串。

     */
    private static void demo01() {
//        1、创建SimpleDateFormat对象，构造方法中传入指定的模式作为参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2、调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化成符合模式的字符串。
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);// Thu Dec 30 18:50:48 CST 2021
        System.out.println(text);// 2021-12-30 18:50:48
    }

    /*
        使用DateFormat中的方法parse 把文本解析成日期
        Date parse(String source) 把符合模式的字符串解析成Date日期
        使用步骤：
            1、创建SimpleDateFormat对象，构造方法中传入指定的模式作为参数
            2、调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串解析为Date日期

        注意：
            public Date parse(String source) throws ParseException
            如果字符串与构造方法中模式不一样，抛出解析异常
            异常处理：1、throws 异常
                    2、try... catch...
     */

    private static void demo02() throws ParseException {
        // 1、创建SimpleDateFormat对象，构造方法中传入指定的模式作为参数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        // 2、调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串解析为Date日期
        Date date = sdf.parse("2021年12月30日");
        System.out.println(date);

    }
}
