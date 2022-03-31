package com.s0cket.day13.demo04.Test;

import java.util.ArrayList;
import java.util.Collections;

/*
    1、准备牌
    2、洗牌
    3、发票
    4、看牌
 */
public class Doudizhu {
    public static void main(String[] args) {
        // 1、准备牌
        // 定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();

        // 定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♥️", "♠️", "♦️", "♣️"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        // 先把大王小王存储到集合中
        poker.add("大王");
        poker.add("小王");

        // 循环嵌套两个数组，组装52张牌
        for(String number : numbers) {
            for(String color : colors) {
                // 把组装好的牌装到poker集合中
                poker.add(color + number);
            }
        }

        // 2、洗牌
        // 使用Collections工具类里面的shuffle方法
        Collections.shuffle(poker);
//        System.out.println(poker);

        // 3、发牌
        // 定义四个集合，给三个人轮流发牌，存储在三个不同的集合中，另外一个集合存储底牌

        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        // 用poker集合的索引遍历
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i >= 51) {
                diPai.add(p);
            } else if(i % 3 == 0) {
                one.add(p);
            } else if(i % 3 == 1) {
                two.add(p);
            } else if(i % 3 == 2) {
                three.add(p);
            }
        }
        // 4、看牌
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(diPai);
    }
}
