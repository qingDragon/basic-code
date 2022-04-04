package com.s0cket.day22.demo07.Function;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
    前者称为前置条件，后者称为后置条件。
    Function接口中抽象方法为：R apply(T t),根据类型T的参数获取类型R的结果。
        使用场景例如：将String类型的数据转换为Integer类型
 */
public class Demo01Function {
    /*
        定义一个方法
        方法的参数为一个字符串类型的整数、一个Function接口<String,Integer>
        使用apply方法，把字符串类型的整数转换为Integer类型的整数
     */
    public static void change(String s, Function<String, Integer> func) {
        int in = func.apply(s);// 自动拆箱
        System.out.println(in);
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的整数
        String s = "1234";
        // 调用change方法
        change(s,(String str)->{
            // 将字符串转换为Integer类型
            return Integer.parseInt(str);
        });
    }
}
