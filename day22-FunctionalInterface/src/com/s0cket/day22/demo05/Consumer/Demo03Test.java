package com.s0cket.day22.demo05.Consumer;

import java.util.function.Consumer;

/*
    练习：
        字符串数组当中存有多条信息，请按照格式：“姓名：xx。性别：xx。”的格式将信息打印出来。
        要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
        将打印性别的动作作为第二个Consumer接口的Lambda实例，
        将两个Consumer接口按照顺序“拼接”到一起。

 */
public class Demo03Test {
    //定义一个方法，参数传递String类型的数组和两个Consumer接口，泛型使用String
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        // 遍历字符串数组
        for (String s : arr) {
            // 消费字符串
            con1.andThen(con2).accept(s);
        }
    }
    public static void main(String[] args) {
        // 定义一个字符串类型的数组
        String[] arr = {"迪丽热巴,女", "古力娜扎,女","玛尔扎哈,男","铁打赵晓,女"};
        // 调用方法printInfo,参数传递String类型的数组和两个Lambda表达式，泛型使用String
        printInfo(arr,
                (s) ->{
                    // 消费方式：获取姓名并打印
                    String name = s.split(",")[0];
                    System.out.print("姓名:" + name);
                },
                (s) ->{
                    // 消费方式：获取性别并打印
                    String sex = s.split(",")[1];
                    // 打印并换行
                    System.out.println(",性别:" + sex + "。");
                });
    }
}
