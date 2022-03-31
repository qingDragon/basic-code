package com.s0cket.day20.demo08.BufferedStream;

import java.io.*;

/*
    文件复制练习：一读一写
    和之前的字节输入输出流复制文件的效率进行对比

    明确：
        数据源：/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg
        数据目的地：/Users/yanzhuang/Desktop/1.jpg

    文件复制的步骤：
        1、创建字节缓冲输入流对象，构造方法中传递字节输入流
        2、创建字节缓冲输出流对象，构造方法中传递字节输出流
        3、使用字节缓冲输入流中的方法read,读取文件
        4、使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区
        5、释放资源（会先把缓冲区中的数据，刷新到文件中）
 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1、创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg"));
        //2、创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/yanzhuang/Desktop/2.jpg")
        );
        //3、使用字节缓冲输入流中的方法read,读取文件
        //int len = 0;
        //while ((len = bis.read()) != -1 ) {
        //    //4、使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区
        //    bos.write(len);
        //}
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0, len);
        }
        //5、释放资源（会先把缓冲区中的数据，刷新到文件中）
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("字节缓冲输入输出流复制文件共耗时：" + (e-s) + "毫秒");
    }
}
