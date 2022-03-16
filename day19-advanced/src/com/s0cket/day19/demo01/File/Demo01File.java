package com.s0cket.day19.demo01.File;

import java.io.File;

/*
    java.io.File类
    文件和目录路径名的抽象表示形式。
    java把电脑中的文件和文件夹（目录）封装成了一个File类，我们可以使用File类操作文件和文件夹
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小
    File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法

    重点：
        记住这三个单词
        file：文件
        directory:文件夹/目录
        path:路径

    File类的静态成员变量

 */
public class Demo01File {
    public static void main(String[] args) {
//        File类的静态成员变量
//        static final String pathSeparator :The system-dependent path-separator character, represented as a string for convenience.
//        static final char pathSeparatorChar :The system-dependent path-separator character.
//        static final String separator :The system-dependent default name-separator character, represented as a string for convenience.
//        static final char separatorChar :The system-dependent default name-separator character.
        // 路径分隔符 linux ：  Windows ;
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);
        // 文件名称分隔符 Windows \   linux /
        String separator = File.separator;
        System.out.println(separator);

        // 操作路径，不应该写死了
        // C:\dev\a.txt  Windows
        // C:/dev/a.txt linux
        // "C:" + File.separator + "dev" + File.separator + "a.txt"
        System.out.println("C:" + File.separator + "dev" + File.separator + "a.txt");
    }
}
