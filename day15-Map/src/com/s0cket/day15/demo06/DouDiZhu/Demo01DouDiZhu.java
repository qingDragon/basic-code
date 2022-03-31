package com.s0cket.day15.demo06.DouDiZhu;

import java.util.*;

/*
    1、组装一副牌
    2、洗牌
    3、发牌
    4、排序
    5、打印
 */
public class Demo01DouDiZhu {
    public static void main(String[] args) {
        // 1、组装一副牌
        // 创建一个Map集合存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        // 创建一个list集合存储牌的索引
        List<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = List.of("♠","♣","♦","♥");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");

        // 添加大王小王到map集合中，索引集合中添加0和1
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        poker.put( ++index, "小王");
        pokerIndex.add(index);

        // 遍历添加元素
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(++index, color+number);
                pokerIndex.add(index);
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);

        // 2、洗牌
        Collections.shuffle(pokerIndex);

        // 3、发牌
        // 创建四个集合进行发牌
        List<Integer> play01 = new ArrayList<>();
        List<Integer> play02 = new ArrayList<>();
        List<Integer> play03 = new ArrayList<>();
        List<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i>50) {
                diPai.add(pokerIndex.get(i));
            } else if(i%3 == 0) {
                play01.add(pokerIndex.get(i));
            } else if(i%3 == 1) {
                play02.add(pokerIndex.get(i));
            } else if(i%3 == 2) {
                play03.add(pokerIndex.get(i));
            }
        }

        // 4、排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(diPai);

        // 看牌
        showPoker("play01",poker,play01);
        showPoker("play02",poker,play02);
        showPoker("play03",poker,play03);
        showPoker("diPai",poker,diPai);
    }
    /*
        params:
        String name : 玩家姓名
        Map<Integer,String> poker ：扑克牌
        List<Integer> pokerIndex ：扑克牌索引
     */
    private static void showPoker(String name, Map<Integer,String> poker, List<Integer> pokerIndex){
        System.out.print(name + ":");
        // 遍历集合
        for (int i = 0; i < pokerIndex.size(); i++) {
            System.out.print(poker.get(pokerIndex.get(i))+ " ");
        }
        System.out.println();
    }
}
