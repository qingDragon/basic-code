package com.s0cket.day10.demo07;

import java.security.Key;

public class Laptop {
    public void start() {
        System.out.println("笔记本开机");
    }

    public void shutdown() {
        System.out.println("笔记本关机");
    }

    public void useUSB(USB usb) {
        if ( usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if ( usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.tap();
        }
    }
}
