package com.s0cket.day16.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是java语言中所有错误和异常的超类
        Exception:编译期异常，进行编译（写代码）java程序出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行。
        Error:错误
            错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能够继续执行。

 */
public class Demo01Exception {
    public static void main(String[] args) {
        // java编译器异常，java程序在编译时（写代码）时异常
        // 第一种处理方式：直接将异常抛出给jvm进行处理，jvm的处理方式就是打印出异常并继续执行程序。
        // 弊端就是如果写的格式有问题的话也不能编译通过，这时候需要可以进行第二种方法
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse("1999-09-09");
//        System.out.println(date);

        // 第二种处理方式：try catch
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");


    }
}
