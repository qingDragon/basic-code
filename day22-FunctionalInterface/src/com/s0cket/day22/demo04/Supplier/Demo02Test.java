package com.s0cket.day22.demo04.Supplier;

import java.util.function.Supplier;

/*
    练习：
        求数组元素最大值：
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
        提示：接口的泛型请使用：java.lang.Integer
 */
public class Demo02Test {
    // 定义一个方法，用户获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static Integer getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个int类型的数组，并赋值
        int[] arr = {100, 20, -88, 23, 878, -239};
        // 调用getMax方法，方法的参数是一个函数式接口，传递Lambda表达式
        int maxValue = getMax(() -> {
            // 定义一个int类型变量
            int max = arr[0];
            // 循环遍历数组,比较大小
            for (int i : arr) {
                if(max < i) {
                    max = i;
                }
            }
            return max;
        });
        // 打印最大值
        System.out.println("arr的最大值：" + maxValue);
    }
}
