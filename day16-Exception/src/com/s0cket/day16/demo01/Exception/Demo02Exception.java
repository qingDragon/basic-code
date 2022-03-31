package com.s0cket.day16.demo01.Exception;

/*
    分析异常产生的原因和处理过程
        1、访问了数组中的3索引，而数组中是没有3索引的，这时候jvm检测出了程序异常
            jvm会做两件事情：
                -jvm会根据异常产生的原因创建一个异常对象，这个对象包含了异常产生的（原因、位置、内容）
                    new ArrayIndexOutOfBoundsException("3");
                -在getElement方法中没有处理异常的逻辑（try-catch),所以jvm会将异常抛给方法的调用者main方法进行处理。
        2、main方法接收到了这个异常对象，但是main方法也没有处理异常的逻辑，所以将异常抛给方法的调用者JVM进行处理。
        3、JVM接收到了异常对象，做了两件事：
            - 把异常的对象以红色的字体打印在控制台
            - JVM会中止当前执行的程序（中断处理）


 */
public class Demo02Exception {
    public static void main(String[] args) {
        // 创建int类型的数组并赋值
        int[] arr = {1, 2, 3};
        int e = getElement(arr,3);
        System.out.println(e);
    }
    /*
        定义一个方法，通过索引从数组中获取元素，返回值为int类型
            参数：
            int[] arr
            int i
     */
    private static int getElement(int[] arr, int index) {
        int result = arr[index];
        return result;
    }
}
