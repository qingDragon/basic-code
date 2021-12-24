package com.s0cket.day10.demo07;

public class Demo01Main {
    public static void main(String[] args) {
        USB usb1 = new Mouse();
        USB usb2 = new Keyboard();

        Laptop laptop = new Laptop();
        // 打开笔记本电脑
        laptop.start();// 笔记本开机
        // 打开usb设备
        usb1.open();
        usb2.open();
        // 笔记本使用打开的USB设备
        laptop.useUSB(usb1);
        laptop.useUSB(usb2);
        // USB设备关闭
        usb1.close();
        usb2.close();
        // 笔记本电脑关机
        laptop.shutdown();

    }
}
