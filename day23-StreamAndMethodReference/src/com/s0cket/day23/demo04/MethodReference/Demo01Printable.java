package com.s0cket.day23.demo04.MethodReference;

public class Demo01Printable {
    // 定义一个方法，参数传递Printable接口，对字符串进行打印
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        // 调用printString方法
        printString((s)->{
            System.out.println(s);
        });
        /*
            分析：
                Lambda表达式的目的，打印参数传递的字符串
                把参数s传递给System.out对象，调用out对象的println方法对字符串进行了输出
                注意：
                    1、System.out对象已经存在
                    2、println方法也是已经存在的
                所以我们可以使用方法引用来优化Lambda表达式
         */
        printString(System.out::println);
    }
}
