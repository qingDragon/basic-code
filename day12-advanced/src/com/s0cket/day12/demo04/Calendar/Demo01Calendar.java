package com.s0cket.day12.demo04.Calendar;

import java.util.Calendar;

/*
    java.util.Calendar类：日历类
    Calendar 类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR）
    Calendar 无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象。
    static Calendar getInstance() 使用默认使用时区和语言环境获得一个日历。

 */
public class Demo01Calendar {
    public static void main(String[] args) {
        // 使用getInstance静态方法，获取Calendar 对象
        Calendar calendar = Calendar.getInstance();// 多态

        // 调用get方法获取日历中的月份字段
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);// 0    注意：国外是0-11月，我们是1-12月

        // set方法设置日历的MONTH字段为2
        calendar.set(Calendar.MONTH, 2);
        System.out.println(calendar.get(Calendar.MONTH)); //2

        // add方法可以增减字段的值,第二个参数符号为正增加，符号为负减少
        calendar.add(Calendar.MONTH, -2);
        System.out.println(calendar.get(Calendar.MONTH));
    }
}
