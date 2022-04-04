package com.s0cket.day22.demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    练习：集合信息筛选
    数组当中有多条“姓名+性别”的信息如下，
    String[] arr = {"迪丽热巴,女", "古力娜扎,女","玛尔扎哈,男","铁打赵晓,女"};
    请通过Predicate接口的拼装将符合要去的字符串筛选到ArrayList中，需要同时满足两个条件：
        1、必须为女生；
        2、姓名为4个字
 */
public class Demo05Test {
    /*
        定义一个方法，方法的参数传递一个包含人员信息的数组
        传递两个Predicate接口，用于对数组中的信息进行过滤
        把满足条件的信息保存到ArrayList集合中并返回
     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        // 定义一个ArrayList集合，存储筛选后的数据
        ArrayList<String> list = new ArrayList<>();
        // 遍历数组中的字符串进行判断
        for (String s : arr) {
            if(pre1.and(pre2).test(s)){
                // 同时满足两个条件添加到集合中
                list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // 定义一个字符串数组
        String[] arr = {"迪丽热巴,女", "古力娜扎,女","玛尔扎哈,男","打铁赵晓,女"};
        // 调用filter方法，参数传递一个字符串数组，两个Lambda表达式
        ArrayList<String> arrayList = filter(arr,
                (String str)->{
                    // 条件1：必须为女生
                    return str.split(",")[1].equals("女");
                },
                (String str)->{
                    // 条件2：姓名为4个字
                    return (str.split(",")[0].length()) == 4;
                });
        // 遍历集合输出
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
