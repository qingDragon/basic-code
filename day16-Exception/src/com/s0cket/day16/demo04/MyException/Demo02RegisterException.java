package com.s0cket.day16.demo04.MyException;
/*
    将RegisterException改成RuntimeException的子类，即运行时异常

    调用方法则无需抛出相应的异常，最后编译器会进行处理。
 */
import java.util.Scanner;

public class Demo02RegisterException {
    // 1、使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) {
        //2、使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();

        checkUsername(username);
    }
    // 3、定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsername(String username) {
        // 遍历已经注册过的用户名的数组
        for (String s : usernames) {
            // 与用户输入的用户名进行比较
            if(s.equals(username)) {
                // true:用户名已存在，抛出异常
                //throw new RegisterException("亲，该用户名已经被注册！");
            }
        }
        // 循环结束没有重复，提示用户注册成功
        System.out.println("恭喜您，注册成功！");
    }
}
