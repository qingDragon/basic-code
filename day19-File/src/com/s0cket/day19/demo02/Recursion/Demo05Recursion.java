package com.s0cket.day19.demo02.Recursion;

import java.io.File;
/*
    综合案例：
    搜索指定目录中的 .java 文件
    分析：
        1、遍历多层级目录
        2、遍历目录时对子文件进行名称判断
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("/Users/yanzhuang/IdeaProjects/basic-code/day19-advanced/src/com/s0cket/day19");
        printAllFiles(file);
    }
    /*
        定义一个方法，对指定目录进行遍历
     */
    public static void printAllFiles(File dir){
        // 获取dir中的所有File对象
        File[] files = dir.listFiles();
        // 遍历File对象数组
        for (File file : files) {
            // 判断file对象是否是文件夹
            if(file.isDirectory()) {
                // 是文件夹继续递归调用printAllFiles方法
                printAllFiles(file);
            } else {
                // 不是文件夹
                // 就是文件
                // 判断是否是.java结尾
                if(file.getName().toLowerCase().endsWith(".java")){
                    // 如果是java文件，打印file.toString
                    System.out.println(file);
                }
            }
        }
    }
}
