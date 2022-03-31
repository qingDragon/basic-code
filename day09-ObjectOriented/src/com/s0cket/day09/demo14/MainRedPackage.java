package com.s0cket.day09.demo14;

import java.util.ArrayList;
/*
题目：群主发普通红包
群里有多名成员，群主给成员发普通红包，规则：
1、群主的一笔金额，从群主的余额中扣除，平均分成n等分，让成员领取；
2、成员领取红包后，保存到成员余额中。
 */
public class MainRedPackage {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();// 100
        one.show();// 0
        two.show();// 0
        three.show();// 0
        System.out.println("===============================");

        ArrayList<Integer> list = manager.send(20,3);
        // 6,6,8 随机三份
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();// 80
        one.show();//
        two.show();//
        three.show();//

    }
}
