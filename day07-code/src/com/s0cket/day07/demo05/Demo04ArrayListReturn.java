package com.s0cket.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法实现筛选。
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNum = random.nextInt(100) + 1;
            list.add(randomNum);
            System.out.println("随机数：" + randomNum);
        }
        System.out.println("原始的list：" + list);//打印原始的list

        ArrayList<Integer> resultList = returnList(list);
        System.out.println("新的list：" + resultList);//打印筛选过偶数的list
    }

    public static ArrayList<Integer> returnList(ArrayList<Integer> list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num % 2 == 0) {
                resultList.add(num);
            }
        }
        return resultList;
    }
}
