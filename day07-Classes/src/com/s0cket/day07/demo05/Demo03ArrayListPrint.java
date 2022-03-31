package com.s0cket.day07.demo05;

import java.util.ArrayList;

/*
题目：定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}括起集合，使用@分隔每个元素。
格式参照{元素@元素@元素}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        printList(list);

    }

    public static void printList(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i != list.size()-1) {
                System.out.print("@" + list.get(i) );//中间的所有元素都是@+元素
            } else {
                System.out.println("@" + list.get(i)+ "}");//第size-1号元素需要在右边增加右大括号
            }
        }
    }
}
