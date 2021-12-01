package com.s0cket.day05.demo04;


/*
一个方法可以有0、1、多个参数；但是只能有0或者1个返回值，不能有多个返回值。
如果希望一个方法中产生多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可。

任何数据类型都能作为方法的参数类型，或者返回值类型。

数组作为方法的参数，传递进去的其实是数组的地址值。
数组作为方法的返回值，返回的其实也是数组的地址值。

 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);

        System.out.println("main方法收到的返回值数组：" + result);

        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);
    }

    /*
    三要素：
    返回值：
    方法名称：
    参数列表：int a, int b, c
     */

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        /*
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        */

        int[] array = { sum, avg };

        System.out.println("calculate方法传递的数组：" + array);
        return array;
    }
}
