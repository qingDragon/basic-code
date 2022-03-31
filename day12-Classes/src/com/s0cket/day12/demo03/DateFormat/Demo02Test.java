package com.s0cket.day12.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：
    请使用日期时间相关的API，计算出一个人已经出生了多少天。
    分析：
    1、输入出生日期字符串
    2、格式化解析成Date
    3、转换成毫秒
    4、获取当前时间的毫秒形式
    5、delta = 当前 - 出生
    6、days = delta/1000/60/60/24 // 计算时间

 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        System.out.print("请输入出生日期【格式：xxxx年xx月xx日】：");
        // 键盘输入出生日期字符串 "2022年03月08日"
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int resultDays = age2days(str);
        System.out.println("已经出生天数：" + resultDays);

    }
    /*
        返回值：int 返回天数
        参数：String str 出生日期字符串
        函数名：age2days
     */
    private static int age2days(String str) throws ParseException {
        // 解析输入的字符串为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(str); // 出生日期的Date格式

        Date nowDate = new Date();// 当前日期
        long delta = nowDate.getTime() - birthDate.getTime();// 现在的毫秒时间减去出生的毫秒时间
        int result = (int)(delta / (1000 * 60 * 60 *24)); // 将长整型强转为整型

        return result;
    }

}
