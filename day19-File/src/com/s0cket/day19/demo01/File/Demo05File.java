package com.s0cket.day19.demo01.File;

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        - public boolean createNewFile():当且仅当具有该名称的文件上不存在时，创建一个新的空文件。
        - public boolean delete()：删除由此File表示的文件或目录
        - public boolean mkdir()：创建由此File表示的目录。
        - public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("zhao.txt");
        System.out.println("是否存在：" + f.exists());// false
        System.out.println("是否创建" + f.createNewFile()); // true
        System.out.println("是否存在：" + f.exists());// true

        // 目录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在：" + f2.exists());
        System.out.println("是否创建：" + f2.mkdir());
        System.out.println("是否存在：" + f2.exists());


        // 创建多级目录
        File f3 = new File("newDir/newDirB");
        System.out.println("是否存在：" + f3.exists());
        System.out.println("是否创建：" + f3.mkdirs());
        System.out.println("是否存在：" + f3.exists());
    }
}
