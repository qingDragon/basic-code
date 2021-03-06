package com.s0cket.day20.demo01.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
    追加写/续写：使用两个参数的构造方法
        FileOutputStream(String name, boolean append) 创建一个向具有指定 name 的文件中写入数据的输出文件流。
        FileOutputStream(File file, boolean append) 创建一个向指定file 对象表示的文件中写入数据的文件输出Luis。
        参数：
            String name,File file ：写入数据的目的地
            boolean append:追加写开关
                true:创建对象不会覆盖源文件，继续在文件的末尾追加写数据
                false:创建一个新文件，覆盖源文件
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day20-advanced/c.txt",true);
        fos.write("您好".getBytes()); // 将字符串转换为字节数组
        fos.close();
    }
}
