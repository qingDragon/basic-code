package com.s0cket.day05.demo03;


/*
数组元素的反转
原：[1,2,3,4]
后：[4,3,2,1]

分析：
1、数组元素反转，其实就是对称位置的元素交换。
2、通常遍历数组用的是一个索引：
int i = 0;
现在表示对称位置需要两个索引：
int min = 0;
int max = array.length - 1;

3、如何交换两个变量的值？
int a = 10;
int b = 20;
如果是两个水杯，都是满的，如何交换？借助第三个空杯子。
int temp = a;
a = b;
b = temp;//使用第三个变量倒手

4、什么时候停止交换？
（1）min == max
（2）min > max

也就是说，什么时候应该交换？
   min < max


 */
public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //反转
        /*
        初始化语句：int min = 0, max = array.length-1
        条件判断：min < max
        步进表达式：min++, max--
        循环体：用第三个变量倒手，三行语句
         */
        for(int min = 0, max = array.length-1;min < max;min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //遍历变换后的数组
        System.out.println("=============================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
