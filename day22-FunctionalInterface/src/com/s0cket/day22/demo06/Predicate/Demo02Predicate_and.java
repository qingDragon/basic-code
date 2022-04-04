package com.s0cket.day22.demo06.Predicate;

import java.util.function.Predicate;

/*
    逻辑表达式：可以连接多个判断的条件
    &&：与运算符
    ||：或运算符
    ！：非（取反）运算符

    需求：
        判断一个字符串，有两个判断的条件
        1、判断字符串的长度是否大于5
        2、判断字符串中是否包含a
        两个条件必须同时满足，我们就可以使用&&运算符来连接两个条件

    Predicate接口中有一个default方法and，表示并且关系
    方法的源码就是用&&逻辑运算符连接的。
 */
public class Demo02Predicate_and {
    /*
        定义一个方法，方法的参数，传递一个字符出纳
        传递两个Predicate接口
            一个用于判断字符串的长度是否大于5
            一个用于判断字符串中是否包含a
            两个条件必须同时满足
     */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        //return pre1.test(s) && pre2.test(s);
        // 使用default方法and
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abefg";
        // 调用checkString,参数传递字符串和两个Lambda表达式
        boolean b = checkString(s, (String str)-> {
            // 判断字符串的长度是否大于5
            return str.length()>5;
        },(String str)->{
            // 判断字符串中是否包含a
            return str.contains("a");
        });

        System.out.println(b);
    }
}
