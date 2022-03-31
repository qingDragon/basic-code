package com.s0cket.day19.demo01.File;

import java.io.File;

/*
    File类获取功能的方法
        - public String getAbsolutePath():返回此File的绝对路径名称字符串。
        - public String getPath():将此File转换为路径名字字符串。
        - public String getName():返回由此File表示的文件或者目录的名称。
        - public long length()：返回由此File表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        File f = new File("/usr/yanzhuang/zhaoxiao.java");
        System.out.println("文件绝对路径：" + f.getAbsolutePath());
        System.out.println("文件的构造路径：" + f.getPath());
        System.out.println("文件名称：" + f.getName());
        System.out.println("文件长度：" + f.length() + "字节");


        File f2 = new File("/Users/yanzhuang/Downloads");
        System.out.println("目录的绝对路径：" + f2.getAbsolutePath());
        System.out.println("目录的构造路径：" + f2.getPath());
        System.out.println("目录名称：" + f2.getName());
        System.out.println("目录长度" + f2.length() + "字节"); // 只能获取文件的大小，无法使用此方法获取文件夹的大小
    }
}
