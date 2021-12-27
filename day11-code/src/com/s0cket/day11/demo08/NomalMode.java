package com.s0cket.day11.demo08;

import java.util.ArrayList;

/*
普通模式实现类
 */
public class NomalMode implements OpenMode{
    @Override
    public ArrayList<Integer> devide(final int totalMoney, final int totalCount) {// final关键字确保参数不可变

        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int left = totalMoney % totalCount;
        // 最后一个人需要加上平均后的余数
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add(avg+left);
        return list;
    }
}
