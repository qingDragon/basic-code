package com.s0cket.day22.demo03.LambdaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    使用java.util.Comparator来作为方法的返回值类型
 */
public class Demo02Comparator {
    public static Comparator<String> getComparator(){
        // 方法的返回值类型是Comparator接口，返回匿名内部类
        //return new Comparator<String>() {
        //    @Override
        //    public int compare(String o1, String o2) {
        //        // 使用字符串的长度降序排列
        //        return o2.length()-o1.length();
        //    }
        //};
        // 使用Lambda返回
        //return (o1, o2) -> {return o2.length()- o1.length();};

        // 优化后的Lambda
        return (o1, o2) -> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] strings = {"aaaaa","bbb","cccccc","ddddddddd"};
        // 输出排序前的数组
        System.out.println("排序前：" + Arrays.toString(strings));
        // 使用自定义规则进行排序
        Arrays.sort(strings, getComparator());
        // 输出排序后的数组
        System.out.println("排序后：" + Arrays.toString(strings));
    }
}
