package com.s0cket.day16.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try...catch:异常处理的第二种方式
    格式：
        try{
            可能产生异常的代码;
        } catch (定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，接收到异常的对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一些日志中，方便查看
        }
        ...
        catch(异常类名 变量名){

        }

     注意事项：
     1、try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
     2、如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
        如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try...catch之后的代码


 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            // 可能产生异常的代码
            readFile("/Users/yanzhuang/a.xt");
        } catch (IOException e) {
            // 异常的处理逻辑，获取异常对象之后，怎么处理异常对象
//            System.out.println("cath-传递的文件后缀不是.txt");
            /*
                Throwable类中定义了3个异常处理方法
                   public String getMessage() Returns the detail message string of this throwable.返回此throwable的简短描述
                   public String toString() Returns a short description of this throwable. 返回此 throwable的详细消息字符串
                   public void printStackTrace() Prints this throwable and its backtrace to the standard error stream.
                        - JVM打印异常对象，默认使用此方法，打印的异常信息是最全面的
             */
            // System.out.println(e.getMessage());// 方法的后缀名不对！
            // System.out.println(e.toString());// java.io.IOException: 方法的后缀名不对！
            /*
            java.io.IOException: 方法的后缀名不对！
	            at com.s0cket.day16.demo02.Exception.Demo01TryCatch.readFile(Demo01TryCatch.java:58)
	            at com.s0cket.day16.demo02.Exception.Demo01TryCatch.main(Demo01TryCatch.java:31)
             */
            e.printStackTrace();


        }
        System.out.println("后续代码");
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
