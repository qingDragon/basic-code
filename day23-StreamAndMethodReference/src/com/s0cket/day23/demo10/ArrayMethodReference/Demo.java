package com.s0cket.day23.demo10.ArrayMethodReference;
// 数组的构造器引用
public class Demo {
    // 定义一个方法，参数传递一个整数和一个函数式接口,返回一个int类型数组
    public static int[] createArray(int length, ArrayBuilder ab){
        return ab.buildArray(length);
    }
    public static void main(String[] args) {
        // 调用createArray方法
        int[] array = createArray(10,(len)->{
            return new int[len];
        });
        System.out.println(array.length);

        // 使用方法引用优化：已知创建的是int[]，数组的长度已知，创建方法new已知
        int[] arr = createArray(20,int[]::new);
        System.out.println(arr.length);
    }
}
