package com.s0cket.day08.demo02;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

思路：
1、键盘输入，Scanner
2、统计各种字符串：需要遍历每个字符
3、判断是几种分类
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");

        String str = sc.next();
        char[] charArray = str.toCharArray();
        int[] count = new int[4];
        for (int i = 0; i < charArray.length; i++) {
            if( charArray[i] >= 'A' && charArray[i] <= 'Z' ) {
                count[0]++;
            } else if(charArray[i] >='a' && charArray[i] <= 'z'){
                count[1]++;
            } else if(charArray[i] >= '0' && charArray[i] <='9'){
                count[2]++;
            } else {
                count[3]++;
            }
        }
        System.out.println("字符串中大写字母个数：" + count[0]);
        System.out.println("字符串中小写字母个数：" + count[1]);
        System.out.println("字符串中数字字符个数：" + count[2]);
        System.out.println("字符串中其他字符个数：" + count[3]);
    }
}

/*
思路：
1、既然用到键盘输入，肯定是Scanner
2、键盘输入的是字符串，那么：String str = sc.next();
3、定义四个变量，分别代表四种字符各自的出现次数。
4、需要对字符串一个字、一个字进行检查，String-->char[],方法就是toCharArray()
5、遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
6、打印输出四个变量，分别代表四种字符出现次数。
 */