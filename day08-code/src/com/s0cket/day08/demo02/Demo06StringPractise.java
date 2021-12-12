package com.s0cket.day08.demo02;
/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。

 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        String str = getStr(array);
        System.out.println(str);
    }

    public static String getStr(int[] array) {
        String str = new String("[");
        for (int i = 0; i < array.length; i++) {
           if( i!= array.length-1) {
               str = str.concat(array[i] + "#");
           } else {
               str = str.concat(array[i] + "]");
           }
        }
        return str;
    }
}
