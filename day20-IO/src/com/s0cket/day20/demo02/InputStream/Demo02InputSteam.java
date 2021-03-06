package com.s0cket.day20.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次读取多个字节：
    int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
    明确两件事：
    1、方法的参数 byte[] 的作用？
        起到缓冲作用，存储每次读取到的多个字节
        数组的长度一定定义为1024（1kb)或者1024的整数倍
    2、方法的返回值int是什么
        每次读取的有效字节个数


    String类的构造方法
        String(byte[] bytes):把字节数组转换为字符串
        String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset：数组的开始索引 length:转换的字节个数
 */
public class Demo02InputSteam {
    public static void main(String[] args) throws IOException {
        // 创建FileInputStream 对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("day20-advanced/a.txt");
        // 使用FileInputStream对象中的方法read读取文件
        // int read(byte[] b) 从输入流中读取一定数量的字节，将其存储在缓冲区数组b中
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len); //2
//        System.out.println(new String(bytes)); // ab
//        System.out.println(Arrays.toString(bytes));//[97, 98]
//
//        len = fis.read(bytes);
//        System.out.println(len);//2
//        System.out.println(new String(bytes));// cb
//
//        len = fis.read(bytes);
//        System.out.println(len);//-1 结束标记
//        System.out.println(new String(bytes));// cb
//
        /*
            发现以上读取是一个重复的过程，可以使用循环优化
            不知道文件汇总有多少字节，所以使用while循环
            while循环结束的条件，读取到-1结束
         */
        byte[] bytes = new byte[1024];// 存储读取到的多个字节
        int len = 0;// 记录每次读取的有效字节个数
        while((len = fis.read(bytes)) != -1) {
            System.out.println(len);// 3
//            System.out.println(new String(bytes));// abc

            // String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length：转换的字节个数
            System.out.println(new String(bytes,0 ,len)); //abc
        }
        fis.close();
    }
}
