package com.s0cket.day15.demo03.Map;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
    题目：计算一个字符串中每个字符出现的次数

    分析：
    1、创建map集合，key是字符，value是次数
    2、遍历字符串得到每个字符
    3、判断集合中是否有改字符的键，有的话value++， 没有的话添加进去，存储次数为1
    4、打印最终结果
 */
public class Demo03MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        // nextLine方法返回输入的字符串，回车结束
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    private static void findChar(String line) {
        // 多态创建map集合
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            // 判断集合中是否有该字符的键
            // 先获取集合中所有的键
            Set<Character> keySet = map.keySet();

            if(keySet.contains(key)){
                // 有的话，value+1
                map.put(key, map.get(key) + 1 );
            } else {
                // 没有，增加新的键值对
                map.put(key, 1 );
            }
        }
        System.out.println(map);
    }
}
