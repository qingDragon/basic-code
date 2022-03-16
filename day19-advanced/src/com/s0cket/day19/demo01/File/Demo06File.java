package com.s0cket.day19.demo01.File;

import java.io.File;

/*
    File类遍历（文件夹）目录功能
        - public String[] list():返回一个String数组，表示该File目录总的所有子文件或目录。
        - public File[] listFiles():返回一个Files数组，表示该File目录中的所有的子文件或目录。
    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常

        隐藏的文件、文件夹也能获取到
 */
public class Demo06File {
    public static void main(String[] args) {
        File dir = new File("/Users/yanzhuang");

        // 获取当前目录下的文件以及文件夹的名称。
        String[] names = dir.list();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("--------------");
        // 获取当前目录下的文件及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
