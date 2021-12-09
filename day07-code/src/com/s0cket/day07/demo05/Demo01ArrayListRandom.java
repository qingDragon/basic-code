package com.s0cket.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机整数，添加到集合，并遍历集合
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int randomNum = r.nextInt(33) + 1;
            list.add(randomNum);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
