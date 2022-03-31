package com.s0cket.day19.demo01.File;

import java.io.File;

/*
    File判断功能的方法
        - public boolean exists():此File表示的文件或目录是否实际存在
        - public boolean isDirectory():此File表示的文件是否为目录
        - public boolean isFile():此File表示的是否是文件
 */
public class Demo04File {
    public static void main(String[] args) {
        File f = new File("/Users/yanzhuang/Downloads/2022.rar");
        File f2 = new File("/Users/yanzhuang");

        // 判断是否存在
        System.out.println("/Users/yanzhuang/Downloads/2022.rar 是否存在：" + f.exists());
        System.out.println("/Users/yanzhuang 是否存在：" + f2.exists());

        // 判断文件还是目录
        System.out.println("/Users/yanzhuang 文件？：" + f2.isFile());
        System.out.println("/Users/yanzhuang 目录？：" + f2.isDirectory());
    }
}
