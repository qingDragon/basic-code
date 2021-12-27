package com.s0cket.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List 是java.util.ArrayList实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称
        List<String> list = new ArrayList<>();// 多态写法

        List<String> result = addNames(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
    // 接口作为方法的参数或者返回值
    public static List<String> addNames(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        return list;
    }
}
