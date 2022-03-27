package com.s0cket.day20.demo01.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream:字节输出流
        此抽象类是表示输出字节流的所有类的超类。

     定义了一些子类共有的成员方法：
        void close() :Closes this output stream and releases any system resources associated with this stream.
        void flush() :Flushes this output stream and forces any buffered output bytes to be written out.
        void write(byte[] b): Writes b.length bytes from the specified byte array to this output stream.
        void write(byte[] b, int off, int len):Writes len bytes from the specified byte array starting at offset off to this output stream.
        abstract void write(int b):Writes the specified byte to this output stream.

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
    作用：把内存中的数据写入到硬盘的文件中

    构造方法：
        FileOutputStream(String name):创建一个向具有指定名称的文件中写入数据的输出文件流。
        FileOutputStream(File file)创建一个向指定File对象表示的文件中写入数据的文件输出流。
        参数：写入数据的目的：
            String name:目的地是一个文件的路径
            File file:目的地是一个文件
        构造方法的作用：
            1、创建一个FileOutputStream对象
            2、会根据构造方法中传递的文件/文件路径，创建一个空的文件
            3、会把FileOutputStream对象指向创建好的文件
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        // 1、创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("day20-advanced/a.txt");
        // 2、调用FileOutputStream对象中的方法write，把数据写入到文件中
        // abstract void write(int b):将指定的字节写入
        fos.write(97);
        // 3、释放资源
        fos.close();
    }
}
