package com.s0cket.day20.demo06.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK9新特性
    try的前边可以定义流对象
    在try后面的()中可以直接引入流对象的名称（变量名）
    在try代码执行完毕之后，流对象亦可以释放掉，不用写finally

    格式：
        A a = new A();
        B b = new B();
        try(a,b){
            可能会产出异常的代码
        } catch(异常类变量 变量名) {
            异常的处理逻辑
        }
 */
public class Demo03JDK9 {
    public static void main(String[] args) throws IOException {
        // 1、创建字节输入流，读取数据源
        FileInputStream fis = new FileInputStream("/Users/yanzhuang/Pictures/pap.er/1cD6Dm7VcgA.jpg");
        //2、 创建字节输出流，写入读取的数据
        FileOutputStream fos = new FileOutputStream("/Users/yanzhuang/Desktop/1.jpg");

        try(fis;fos) {
            //3、 读取数据，可一次性读取1024个字节，也可尝试一个字节一个字节读read()方法
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = fis.read(bytes)) != -1) {
                // 4、将读取的数据写入到输出流中
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        // 流已关闭
        // java.io.IOException: Stream Closed
        //fos.write(1);
    }
}