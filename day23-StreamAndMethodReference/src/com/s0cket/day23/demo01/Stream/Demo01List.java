package com.s0cket.day23.demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
    传统的集合遍历操作
 */
public class Demo01List {
    public static void main(String[] args) {
        // 创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("玛尔扎哈");
        list.add("赵无极");
        list.add("赵晓");
        list.add("赵匡胤");

        // 对集合中的元素进行过滤，只要"赵"开头的元素，并存储到一个新的集合中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("赵")){
                listA.add(s);
            }
        }

        // 对listA集合进行过滤，取出姓名长度为2的人，并存储到一个新的集合中
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length()==2) {
                listB.add(s);
            }
        }

        // 遍历listB集合
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
