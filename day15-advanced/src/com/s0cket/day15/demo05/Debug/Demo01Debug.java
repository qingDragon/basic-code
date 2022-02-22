package com.s0cket.day15.demo05.Debug;
/*
    Debug调试程序：
        可以让代码逐行进行，查看代码执行的过程，调试程序中出现的Bug
    使用方式：
        在行号的左边，鼠标左键单击，添加断点（每个方法的第一行，哪里有Bug添加到哪里）
        右键，选择Debug执行程序
        程序就会停留在添加的第一个断点处
    执行程序：
        f7:逐行执行程序

        command+f2:退出debug模式，停止程序

        Console：切换到控制台


 */
public class Demo01Debug {
    public static void main(String[] args) {
        System.out.println("helloworld!");
        System.out.println("你是我的战友！");
    }
}
