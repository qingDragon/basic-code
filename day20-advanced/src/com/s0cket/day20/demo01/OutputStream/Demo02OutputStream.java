package com.s0cket.day20.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        public void write(byte[] b): 将b.length字节从指定的字节数组写入此输出流
        public void write(byte[] b, int off, int len):从指定的字节数组写入len字节，从偏移量off开始输出到此输出流。

 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        // 创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("day20-advanced/b.txt"));

        // 调用FileOutputStream对象中的方法write,把数据写入到文件中
        // 在文件中显示100，写个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b):将b.length字节从指定的直接数组写入此输出流
         */
        byte[] bytes = {65, 66, 67, 68, 69}; //ABCDE
        // byte[] bytes = {-65, -66, -67, 68, 69}; // 编码问题

        fos.write(bytes);
        /*
            public void write(byte[] b, int off, int len): 把字节数组的一部分写入到文件中
                int off :数组的开始索引
                int len : 写几个字节
         */
        fos.write(bytes, 1,2); // BC
        /*
            写入字符的方法：可以使用String类的方法把字符串，转换为字节数组
                byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] byte2 = "您好".getBytes();
        System.out.println(byte2); // 直接打印打印是字节数组的地址  [B@4617c264
        System.out.println(Arrays.toString(byte2));// [-26, -126, -88, -27, -91, -67]
        fos.write(byte2);

        // 释放资源
        fos.close();
    }
}
