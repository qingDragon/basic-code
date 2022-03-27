package com.s0cket.day20.demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
    1个中文
        GBK：占用两个字节
        UTF-8：占用3个字节
    为了解决字节流读取中文文件的弊端，Java还提供了字符流，一次读取一个字符

 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day20-advanced/c.txt");
        int len = 0;
        while((len = fis.read()) != -1) {
//            System.out.println(len);
            System.out.println((char)len);// 采用UTF-8编码读取中文时一个一个字节读出来打印的是乱码
        }
        fis.close();
    }
}
