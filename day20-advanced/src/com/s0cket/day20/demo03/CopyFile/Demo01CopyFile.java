package com.s0cket.day20.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制联系：一读一写

    明确：
        数据源：/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg
        数据目的地：/Users/yanzhuang/Desktop/1.jpg

    文件复制的步骤：
        1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3、使用字节输入流对象中的方法read读取文件
        4、使用字节输出流中的方法write，把读取到的字节写入到目的地文件中
        5、释放资源


 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        // 1、创建字节输入流，读取数据源
        FileInputStream fis = new FileInputStream("/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg");
        //2、 创建字节输出流，写入读取的数据
        FileOutputStream fos = new FileOutputStream("/Users/yanzhuang/Desktop/1.jpg");
        ////3、 读取数据，可一次性读取1024个字节，也可尝试一个字节一个字节读read()方法
        //byte[] bytes = new byte[1024];
        //int len = 0;
        //while((len = fis.read(bytes)) != -1) {
        //    // 4、将读取的数据写入到输出流中
        //    fos.write(bytes,0,len);
        //}
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        // 5、释放资源（先关写的，如果写完了肯定读完了）
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("字节输入输出流复制文件共耗时:" + (e-s) + "毫秒");
    }
}
