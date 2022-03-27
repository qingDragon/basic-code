package com.s0cket.day20.demo09.ReverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    FileReader可以读取IDE默认格式编码（utf-8)的文件
    FileReader读取系统默认编码（win默认编码 中文GBK）会产生乱码

 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day20-advanced/mac.txt");

        int len = 0;
        while((len = fr.read()) != -1) {
            System.out.print((char) len);//你好 mac中文默认也是utf-8
        }

        fr.close();
    }
}
