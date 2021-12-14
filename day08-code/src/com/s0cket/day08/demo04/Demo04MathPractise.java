package com.s0cket.day08.demo04;
/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个

思路：
1、既然已经确定了范围，for循环遍历
2、起点位置-10.8应该转换为-10，两种方法：
    2.1 可以使用Math.ceil方法，向上（向正方向）取整
    2.2 强转成int,自动舍弃所有小数位
3、每一个数字都是整数，所以步进表达式应该是num++, 这样每次都是+1de .
4、如何拿到绝对值，Math.abs方法。
5、一旦发现了一个数字，需要让计数器++进行统计。
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for(int num = (int)min; num < max; num++) {
            int numAbs = Math.abs(num);
            if( numAbs > 6 || numAbs < 2.1){
                System.out.println(num);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
