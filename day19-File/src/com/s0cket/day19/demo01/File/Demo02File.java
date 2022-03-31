package com.s0cket.day19.demo01.File;

import java.io.File;

/*
    路径：
        绝对路径：是一个完整的路径

        相对路径：是一个简化的路径
            相对指的是相对于当前项目的根目录
            如果使用当前项目的根目录，路径可以简化书写

        注意：
            1、路径是不区分大小写
            2、路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠


     File类的构造方法

 */
public class Demo02File {
    public static void main(String[] args) {
        show03();
    }
    /*
        File(File parent, String child) Creates a new File instance from a parent abstract pathname and a child pathname string.
        参数：把路径分成了两部分
            File parent:父路径
            String child:子路径
        好处：
            父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
            父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象

     */
    private static void show03() {
        File parent = new File("/usr/yanzhuang/");
        File file = new File(parent,"hello.java" ); // 可以使用parent的方法进行进一步的操作
        System.out.println(file);
    }

    /*
        File(String parent, String child) Creates a new File instance from a parent pathname string and a child pathname string.
        参数：把路径分成了两个部分
            String parent:父路径
            String child:子路径
        好处：
            父路径和子路径可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File f = new File(parent,child);
        System.out.println(parent+child);

    }

    /*
        File(String pathname) Creates a new File instance by converting the given pathname string into an abstract pathname.
        参数列表：
        String pathname:字符串的字符名称
        路径可以是以文件结尾，也可以是以文件夹结尾
        路径可以是相对路径，也可以是绝对路径
        路径可以是存在的，也可以是不存在的
        注意：创建File对象，只是把路径封装为File对象，不考虑路径是否真实存在
     */
    private static void show01() {
        File f1 = new File("/usr/yanzhuang/hello/a.txt");
        System.out.println(f1);

        File f2 = new File("/usr/yanzhuang/zhaoxiao");
        System.out.println(f2);

        File f3 = new File("zhao.txt");
        System.out.println(f3);
    }
}
