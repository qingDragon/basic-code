package com.s0cket.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();
        //首先，看一下当前有多有余额
        int leftMoney = super.getMoney(); // 查看余额
        if(leftMoney < totalMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，就是重新设置余额
        super.setMoney(leftMoney-totalMoney);

        //发红包，需要平均分成count份
        int avg = totalMoney/count;
        int mod = totalMoney%count;

        for (int i = 0; i < count-1 ; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod);
        return redList;
    }
}
