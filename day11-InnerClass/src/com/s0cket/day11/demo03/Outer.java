package com.s0cket.day11.demo03;

/*
如果内部类与外部类的成员变量出现了同名，那么从内部类访问外部类成员变量的格式：
外部类名称.this.成员变量名
 */
public class Outer {
    int num = 10;

    public class Inner {
        int num = 20;
        public void methodInner() {
            int num = 30;

            System.out.println(num); // 内部类方法的局部变量，就近原则
            System.out.println(this.num); // 内部类的成员变量
            System.out.println(Outer.this.num);// 外部类的成员变量
        }
    }

}
