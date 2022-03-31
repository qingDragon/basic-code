package com.s0cket.day16.demo02.Exception;
/*
    finally代码块

    格式：
        try{
            可能产生异常的代码
        } catch(定义一个异常的变量，用来接收try中抛出的异常对象) {
            异常的处理逻辑
        } finally {
            无论是否出现异常都会执行
        }

     注意：
     1、finally 不能单独使用，必须和try 一起使用
     2、finally 一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO操作时使用较多）

 */

import java.io.IOException;

public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("/Users/yanzhuang/a.tt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }

    private static void readFile(String filename) throws IOException {
        /*
            如果传递的后缀名不对，抛出IO异常，告诉方法的调用者
         */
        if(!filename.endsWith(".txt")){
            throw new IOException("方法的后缀名不对！");
        }
        System.out.println("文件路径正确，读取文件");
    }
}

