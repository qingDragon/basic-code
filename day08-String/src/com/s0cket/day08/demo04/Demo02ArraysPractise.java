package com.s0cket.day08.demo04;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "adsajfks82fas22jjl2d";

        char[] chars = str.toCharArray();

        Arrays.sort(chars);
        // chars.forr 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
