package com.s0cket.day16.demo01.Exception;

import java.util.Objects;

/*
    Objects类中的静态方法：
    public static <T> T requireNonNull(T obj):查看指定引用对象是不是null.
    源码：
        public static <T> T requireNonNull(T obj){
            if(obj == null)
                throw new NullPointerException();
            return obj;
        }
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object o) {
        // 对传递过来的参数进行合法性判断，判断是否为null
//        if( o == null) {
//            throw new NullPointerException("传递的对象值是null");
//        }
//        System.out.println(o);
        Objects.requireNonNull(o,"传递的对象值是null");
    }
}
