package com.s0cket.day22.demo07.Function;

import java.util.function.Function;

/*
    Function接口中的default方法andThen:用来进行组合操作

    需求：
        把String类型的“123”,转换为Integer类型，把转换后的结果加10
        把增加之后的Integer类型的数据，转换为String类型
 */
public class Demo02Function_andThen {
    /*
        定义一个方法：
        参数传递一个字符串类型的整数，和两个Function接口
     */
    public static void change(String s, Function<String, Integer> func1, Function<Integer, String> func2) {
        // 使用andThen方法进行拼接两个转换操作
        String str = func1.andThen(func2).apply(s);
        System.out.println(str);
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的数
        String s = "123";
        // 调用change方法
        change(s,
                (String str)->{
                    // 把String类型的“123”,转换为Integer类型，把转换后的结果加10
                    return Integer.parseInt(s) + 10;
                }, (Integer in)->{
                    // 把增加之后的Integer类型的数据，转换为String类型
                    return in.toString();
                });
    }
}
