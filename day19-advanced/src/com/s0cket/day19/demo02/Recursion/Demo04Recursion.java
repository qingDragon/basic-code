package com.s0cket.day19.demo02.Recursion;

import java.io.File;

/*
    练习：
        递归打印多级目录
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("/Users/yanzhuang/Desktop/a/C");
        printAllFile(file);
    }

    /*
        定义一个方法，递归打印所有目录
     */
    public static void printAllFile(File dir){
        System.out.println(dir);// 打印初始目录
        File[] files = dir.listFiles();
        // 遍历目录中的所有File对象
        for (File file : files) {
            // 如果file是目录的话，递归调用
            if(file.isDirectory()) {
                printAllFile(file);
            } else {
                // 如果不是,直接打印
                System.out.println(file);
            }
        }
    }
}
