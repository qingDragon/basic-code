package com.s0cket.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随机抽取一个给自己
        // 随机获取一个集合中的编号
        int index = new Random().nextInt(list.size());
        // 根据索引，删除集合中对应的红包，并且将删去的红包给自己
        int delta = list.remove(index);

        // 查看当前有多少钱
        int money = super.getMoney();

        // 加法，然后更新余额
        super.setMoney(money + delta);
    }
}
