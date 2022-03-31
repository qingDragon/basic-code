package com.s0cket.day20.demo06.trycatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前使用try catch finally 处理流中的异常方式
    格式：
        try{
            可能会产生异常的代码
        } catch(异常变量名 变量名){
            异常的处理逻辑
        } finally{
            一定会指定的代码
            资源释放
        }
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        // 提高变量的作用域，让finally可以使用
        // 变量在定义的时候，可以没有值，但是使用的时候必须有值
        FileWriter fw = null;
        try {
            fw = new FileWriter("day20-advanced/g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloZX" + i + "\r");
            }
        } catch (IOException e) {
            // 异常的处理逻辑
            System.out.println(e);
        } finally {
            // 一定会执行的代码
            // 创建对象失败了，fw的默认值就是null,null是不能调用方法的，会抛出NullPointerException，需要增加一个判断
           if(fw!=null){
               try {
                   fw.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }

    }
}
