package com.s0cket.day23.demo05.ObjectMethodReference;
/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的，成员方法也是已经存在的
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    // 定义一个方法，方法的参数传递Printable接口
    public static void printString(Printable p) {
        p.print("Hello");
    }
    public static void main(String[] args) {
        // 调用printString方法
        printString((s)->{
            // 创建对象
            MethodRerObject mro = new MethodRerObject();
            // 调用成员方法打印输出
            mro.printUpperCaseString(s);
        });
        /*
            使用方法引用优化Lambda
            对象时已经存在的MethodRerObject
            成员方法也是已经存在的printUpperCaseString方法
            所以可以方法引用
         */
        // 先创建对象
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
