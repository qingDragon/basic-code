package com.s0cket.day16.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常的时候，那么我们必须要处理这个异常
        可以使用throws关键字来处理，会把异常对象声明抛给方法的调用者处理（自己不处理就给别人处理），最终交给JVM处理----中断处理
    使用方法：
        在方法声明时使用
        修饰符 返回值类型 方法名（参数列表）throws AAAException，BBBException...{
            throw new AAAException("产生原因"）
            throw new BBBException("产生原因"）
            ...
        }
    注意：
    1、throws关键字必须写在方法声明处
    2、throws关键字声明的异常必须是Exception或者Exception的子类
    3、方法内部如果抛出了多个异常对象，那么throws后面也必须声明多个异常
        如果抛出的多个异常对象有父子类的关系，那么只要声明父类异常即可
    4、调用了一个声明抛出异常的方法，我们就必须要对声明的异常进行处理
        要么继续使用throws进行抛出，交给方法的调用者处理，最终交给JVM
        要么try...catch...进行处理

 */
public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        // FileNotFoundException extends IOException extends Exception
        // 只需要声明父类异常即可
        readFile("/Users/yanzhuang/a.tt");
    }


    /*
        定义一个方法，对传递的文件路径合法性进行判断
        如何路径不是"/Users/yanzhuang/a.txt"
        那么我们就抛出文件找不到异常，告知方法的调用者
        注意：
            FileNotFoundException是编译异常，出现了这个异常就必须要进行处理
            可以使用throws继续抛出这个异常，让方法的调用者处理
     */
    private static void readFile(String filename) throws IOException {
        if(!filename.equals("/Users/yanzhuang/a.txt")){
            throw new FileNotFoundException("传递的路径不是/Users/yanzhuang/a.txt");
        }
        /*
            如果传递的后缀名不对，抛出IO异常，告诉方法的调用者
         */
        if(!filename.endsWith(".txt")){
            throw new IOException("方法的后缀名不对！");
        }
        System.out.println("文件路径正确，读取文件");
    }
}

