package com.s0cket.day23.demo03.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用Stream流依次进行以下步骤：
        1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        3.第二个队伍只要姓德的成员姓名；存储到一个新集合中。
        4.第二个队伍帅选之后不要前两个人；存储到一个新集合中。
        5.将两个队伍合并为一个队伍：存储到一个新集合中。
        6.根据姓名创建Person对象；存储到一个新集合中。
        7.打印整个队伍的Person对象信息。
 */
public class Demo02StreamTest2 {
    public static void main(String[] args) {
        // 第一个队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("玛尔扎哈");
        one.add("宋");
        one.add("赵匡胤");
        one.add("赵无极");
        one.add("赵大晓");
        one.add("老子");
        one.add("星宿老怪");
        one.add("任登宝");
        one.add("赵雷");

        // 1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        // 2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        Stream<String> stream1 = one.stream().filter(name->name.length()==3).limit(3);

        // 第二个队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("德罗巴");
        two.add("德布劳内");
        two.add("德约科维奇");
        two.add("姆巴佩");
        two.add("C罗");
        two.add("德马科斯");
        two.add("德尚");
        two.add("尼古拉斯凯奇");
        two.add("布莱恩特");

        // 3.第二个队伍只要姓德的成员姓名；存储到一个新集合中。
        // 4.第二个队伍帅选之后不要前两个人；存储到一个新集合中。
        Stream<String> stream2 = two.stream().filter(name->name.startsWith("德")).skip(2);

        // 5.将两个队伍合并为一个队伍：存储到一个新集合中。
        // 6.根据姓名创建Person对象；存储到一个新集合中。
        // 7.打印整个队伍的Person对象信息。
        Stream.concat(stream1,stream2).map(name->new Person(name)).forEach(person -> System.out.println(person));
    }
}
