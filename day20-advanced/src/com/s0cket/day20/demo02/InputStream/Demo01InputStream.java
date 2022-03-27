package com.s0cket.day20.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream : 字节输入流
    此抽象类是表示字节输入流的所有类的超类。

    定义了所有子类共性的方法：
        int read() : 从输入流中读取数据的下一个字节。
        int read(byte[] b)从输入流汇总读取一定数量的字节，并将其存储在缓冲区数组b中。
        void close() 关闭此输入流并释放与该流关联的所有系统资源。

    java.io.FileInputStream extends InputStream
    FileInputStream: 文件字节输入流
    作用：把硬盘文件中的数据，读取到内存中使用

    构造方法：
        FileInputStream(String name)
        FileInputStream(File file)
        参数：
            读取文件的数据流
            String name：文件的路径
            File file :文件对象
        构造方法的作用 ：
            1、会创建一个FileInputStream对象
            2、会把FileInputStream对象指定构造方法中要读取的文件
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day20-advanced/a.txt"); // abc

//        int len = fis.read();
//        System.out.println(len);// 97
//
//        len = fis.read();
//        System.out.println(len);// 98
//
//        len = fis.read();
//        System.out.println(len);// 99
//
//        len = fis.read();
//        System.out.println(len); // -1

        /*
            读取文件是一个重复的过程，可以使用循环优化
            不知道文件有多少个字节，使用while循环
            结束条件是读到-1结束
         */
        int len = 0; // 记录读到的字节
        while((len = fis.read() )!=-1 ) {
            System.out.print((char)len); // abc
        }
        fis.close();
    }
}
