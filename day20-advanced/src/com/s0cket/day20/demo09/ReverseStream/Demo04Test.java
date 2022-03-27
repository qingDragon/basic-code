package com.s0cket.day20.demo09.ReverseStream;

import java.io.*;

/*
    练习：
        转换文件编码
        将GBK编码的文本文件，转换成UTF-8编码的文本文件

    分析步骤：
        1、创建转换输入流对象 charsetName 是gbk
        2、创建转换输出流对象，默认charsetName是utf8
        3、使用转换输入流对象通过gbk编码读取gbk格式的文件中数据
        4、使用转换输出流对象通过utf编码写入到文件中
        5、释放资源
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1、创建转换输入流对象 charsetName 是gbk
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("day20-advanced/gbk.txt"),"gbk"
        );
        //2、创建转换输出流对象，默认charsetName是utf8
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("day20-advanced/gbk_2_utf8.txt")
        );
        //3、使用转换输入流对象通过gbk编码读取gbk格式的文件中数据
        int len = 0;
        while((len = isr.read()) != -1) {
            //4、使用转换输出流对象通过utf编码写入到文件中
            osw.write(len);
        }
        //5、释放资源
        osw.close();
        isr.close();
    }
}
