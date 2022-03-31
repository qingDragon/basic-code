package com.s0cket.day10.demo07;

/*
笔记本电脑（laptop）通常具备使用USB设备的功能。在生产时，笔记本都预留了可以插入USB设备的USB接口，
但具体是什么USB设备，笔记本厂商并不关心，只要符合USB设备规格的都可以。

定义USB接口功能，具备最基本的开启和关闭的功能。鼠标和键盘要想能够在笔记本电脑上使用，就要遵守USB规范，
实现USB接口功能，否则生产出来也无法使用。

分析：
USB接口：包含打开设备和关闭设备功能。
笔记本设备：包含开关机功能，使用USB设备功能。
鼠标：实现USB功能，并具备点击功能。
键盘：实现USB功能，并具备敲击功能。

 */
public interface USB {
    public void open();
    public void close();

}
