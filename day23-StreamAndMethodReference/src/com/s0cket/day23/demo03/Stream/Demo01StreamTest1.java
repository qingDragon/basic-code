package com.s0cket.day23.demo03.Stream;

import java.util.ArrayList;
/*
    有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下步骤：
        1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        3.第二个队伍只要姓德的成员姓名；存储到一个新集合中。
        4.第二个队伍帅选之后不要前两个人；存储到一个新集合中。
        5.将两个队伍合并为一个队伍：存储到一个新集合中。
        6.根据姓名创建Person对象；存储到一个新集合中。
        7.打印整个队伍的Person对象信息。
 */
public class Demo01StreamTest1 {
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
        ArrayList<String> one1 = new ArrayList<>();
        for (String name : one) {
            if(name.length() == 3) {
                // System.out.println(name);
                one1.add(name);
            }
        }
        // 2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        ArrayList<String> one2 = new ArrayList<>();
        for (int i = 0; i < one1.size(); i++) {
            if(i<3) {
                String name = one1.get(i);
                // System.out.println(name);
                one2.add(name);
            }
        }
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
        ArrayList<String> two1 = new ArrayList<>();
        for (String name : two) {
            if(name.startsWith("德")){
                two1.add(name);
            }
        }
        // 4.第二个队伍帅选之后不要前两个人；存储到一个新集合中。
        ArrayList<String> two2 = new ArrayList<>();
        for (int i = 0; i < two1.size(); i++) {
            if(i>=2) {
                String name = two1.get(i);
                two2.add(name);
            }
        }
        // 5.将两个队伍合并为一个队伍：存储到一个新集合中。
        ArrayList<String> list = new ArrayList<>();
        list.addAll(one2);
        list.addAll(two2);
        // 6.根据姓名创建Person对象；存储到一个新集合中。
        ArrayList<Person> list_person = new ArrayList<>();
        for (String name : list) {
            list_person.add(new Person(name));
        }
        // 7.打印整个队伍的Person对象信息。
        for (Person person : list_person) {
            System.out.println(person);
        }
    }
}
