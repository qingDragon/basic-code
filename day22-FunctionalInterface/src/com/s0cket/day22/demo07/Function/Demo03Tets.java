package com.s0cket.day22.demo07.Function;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/*
    需求：使用Function进行函数的拼接，按照顺序需要执行的多个函数操作：
        String str = “打铁赵晓,20”；
        1.将字符串截取数字年龄部分，得到字符串；
        2.将上一步的字符串转换为Int类型的数字；
        3.将上一步的Int类型的数字累加100，得到结果int数字。
 */
public class Demo03Tets {
    /*
        定义一个方法
        参数传递包含姓名和年龄的字符串、3个Function接口
     */
    public static int change(String s, Function<String, String> func1,
                             Function<String, Integer> func2, Function<Integer, Integer> func3){
        return func1.andThen(func2).andThen(func3).apply(s);
    }
    public static void main(String[] args) {
        //定义一个字符串
        String s = "打铁赵晓,20";
        //// 调用change方法
        //int in = change(s,
        //        (String str)->{
        //            return str.split(",")[1];
        //        },
        //        (String str)->{
        //            return Integer.parseInt(str);
        //        },
        //        (Integer integer)->{
        //            return integer +100;
        //        });

        // 优化Lambda
        int in = change(s,
                str->str.split(",")[1],
                str->Integer.parseInt(str),
                integer->integer +100);

        System.out.println(in);
    }
}
