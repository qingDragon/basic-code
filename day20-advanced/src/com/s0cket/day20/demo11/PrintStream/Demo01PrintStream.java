package com.s0cket.day20.demo11.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream:打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值形式。
    PrintStream特点：
        1、只负责数据的输出，不负责数据的读取
        2、与其他输出流不同，PrintStream永远不会抛出 IOException
        3、有特有的方法，print,println
            void print(任意类型的值)
            void println(任意类型的值并换行)
    构造方法：
        PrintStream(File file): 输出的目的地是一个文件
        PrintStream(OutputStream out): 输出的 目的地是一个字节输出流
        PrintStream(String fileName): 输出的目的地是一个文件路径
    PrintStream extends OutputStream
    继承自父类的成员方法：
        void close() :Closes this output stream and releases any system resources associated with this stream.
        void flush() :Flushes this output stream and forces any buffered output bytes to be written out.
        void write(byte[] b): Writes b.length bytes from the specified byte array to this output stream.
        void write(byte[] b, int off, int len):Writes len bytes from the specified byte array starting at offset off to this output stream.
        abstract void write(int b):Writes the specified byte to this output stream.

     注意：
        如果使用继承自父类的write方法写数据，那么查看数据时候就会查询编码表 97->a
        如果使用自己特有的方法print/println方法写数据，写的时候原样输出 97-> 97
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("HelloWorld");
        // 创建打印流对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("day20-advanced/print.txt");

        // 如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
        ps.write(97); // a
        //如果使用自己特有的方法print/println方法写数据，写的时候原样输出 97-> 97
        ps.println(97);

        ps.println("hello");
        ps.println(823.23423);

        //释放资源
        ps.close();
    }
}
