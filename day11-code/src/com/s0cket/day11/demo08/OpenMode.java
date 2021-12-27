package com.s0cket.day11.demo08;

import java.util.ArrayList;

public interface OpenMode {
    /**
     * 请将totalMoney 分成count份，保存到ArrayList<Inteage>中，返回即可。
     *
     * @param totalMoney           总金额为方便计算，已经转换成整数，单位为分。
     * @param totalCount           红包个数
     * @return ArrayList<Integer>  元素为各个红包的金额值，所有元素的值累和等于总金额。
     **/

    ArrayList<Integer> devide(int totalMoney, int totalCount);
}
