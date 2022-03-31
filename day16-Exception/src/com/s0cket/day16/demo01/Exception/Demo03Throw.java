package com.s0cket.day16.demo01.Exception;
/*
    throw关键字
    作用：可以使用throw关键字在指定的方法中抛出异常
    使用格式：throw new xxxxException("异常产生的原因");
    注意：
        1、throw关键字必须写在方法的内部
        2、throw关键字后面new的对象必须是Exception或者Exception的子类对象
        3、throw关键字抛出的指定的异常对象，我们就必须处理这个异常对象
            如果是RuntimeException或者其子类对象，可以不处理，JVM会帮忙处理
            如果是编译期异常，必须进行处理throws 或者 try...catch

 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int res = getElement(arr,3);
        System.out.println(res);
    }
    /*
    定义一个方法，通过索引从数组中获取元素，返回值为int类型
        参数：
        int[] arr
        int i
    为了程序的健壮性，我们需要对传递的参数进行合法性校验，如果参数不合法，需要抛出异常的方式告诉方法调用者。
    注意：NullPointerException、ArrayIndexOutOfBoundsException是运行时异常，默认交给jvm进行处理
 */
    private static int getElement(int[] arr, int index) {
        /*
            我们可以对传递过来的数组参数进行校验、
            如果arr是null
            那就抛出空指针异常，告知方法的调用者"传递的数组的值是null"
         */
        if(arr == null) {
            throw new NullPointerException("传递的数组的值是null");
        }
        /*
            我们可以对传递过来的index参数进行合法性校验
            如果index的范围不在数组的索引范围内
            那么我们就抛出数组索引越界异常，告诉方法的调用者"传递的索引超出了数组的使用范围"
         */
        if(index<0 || index>arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        int result = arr[index];
        return result;
    }
}
