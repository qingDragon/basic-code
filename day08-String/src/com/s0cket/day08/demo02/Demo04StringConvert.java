package com.s0cket.day08.demo02;

import java.nio.charset.StandardCharsets;

/*
String 当中与转换相关的常用方法有：

public char[] toCharArray():将当前字符串拆分为字符数组作为返回值。
public byte[] getBytes():获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串。
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);
        System.out.println("===============");

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("================");

        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);//How do you do?
        System.out.println(str2);

        String str = "会不会玩啊，你大爷的，你大爷的，你大爷的，你大爷的！";
        String newStr = str.replace("你大爷的", "****");
        System.out.println(str);
        System.out.println(newStr);
    }
}
