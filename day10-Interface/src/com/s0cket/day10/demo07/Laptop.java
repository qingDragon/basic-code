package com.s0cket.day10.demo07;

import java.security.Key;

public class Laptop {
    public void start() {
        System.out.println("笔记本开机");
    }

    public void shutdown() {
        System.out.println("笔记本关机");
    }
    // 使用USB设备的方法，使用接口作为方法的参数。
    public void useUSB(USB usb) {
        usb.open();
        if ( usb instanceof Mouse) { // 一定要先判断
            Mouse mouse = (Mouse) usb; // 向下转型
            mouse.click();
        } else if ( usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.tap();
        }
        usb.close();
    }
}
