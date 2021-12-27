package com.s0cket.day11.demo04;
/*
如果局部内部类希望访问方法的局部变量，那么这个局部变量必须是【有效final】的

备注：从Java8 + 开始，只有局部变量事实不变，那么final关键字可以省略。

原因：
1、new出来的对象在堆内存中
2、局部变量是跟着方法走的，存在栈内存中。
3、方法运行结束后，立即出栈，局部变量就会立刻消失。
4、但是new出来的额对象会在堆中持续存在，直到垃圾回收才会消失。
 */
public class MyOuter {
    public void methodOuter() {
        int num = 10;// 方法的局部变量
//        num = 20; // 不能再改变num的值
        class MyInner {
            public void Inner() {
                System.out.println(num);
            }
        }
    }
}
