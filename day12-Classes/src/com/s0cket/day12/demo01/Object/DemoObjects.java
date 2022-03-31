package com.s0cket.day12.demo01.Object;

import java.util.Objects;

public class DemoObjects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";

        /*
        null 不能调用equals方法，会抛出空指针异常
         */
//        Boolean b = s1.equals(s2);// java.lang.NullPointerException

        /*
            Objects类中的equals方法：对两个对象进行比较，防止了空指针异常
            源码：
            public static boolean equals(Object a, Object b) {
                // a和b是同一个对象直接返回，ab不同对象情况下a不等于null且a与b equals 返回值为true
                return (a == b) || (a != null && a.equals(b));
            }
         */

        Boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2); // false
    }
}
