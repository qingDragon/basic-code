package com.s0cket.day20.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的新特性
    在try后面可以增加一个()，在括号中可以定义流对象，那么这个流对象的作用域就在try中有效

    try中的代码执行完毕，会自动将流对象释放，不用写finally
    格式：
        try(定义流对象；定义流对象;...){
            可能会产出异常的代码
        } catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try(// 1、创建字节输入流，读取数据源
            FileInputStream fis = new FileInputStream("/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg");
            //2、 创建字节输出流，写入读取的数据
            FileOutputStream fos = new FileOutputStream("/Users/yanzhuang/Desktop/1.jpg");){

            //3、 读取数据，可一次性读取1024个字节，也可尝试一个字节一个字节读read()方法
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = fis.read(bytes)) != -1) {
                // 4、将读取的数据写入到输出流中
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            // 异常的处理逻辑
            System.out.println(e);
        }
    }
}
