package com.s0cket.day08.demo03;
/*
一旦使用static关键字修饰成员方法，那么就成为了静态方法。静态方法不属于对象，而是属于类的。

如果没有static关键字，首先必须要创建对象，然后通过对象来调用。
如果有了static关键字，那么不需要创建对象，直接就能通过类名称进行调用。

无论是成员变量，还是成员方法，只要有了static关键字，都推荐用类名称进行调用。

静态变量：类名称.静态变量
静态方法：类名称.静态方法

注意事项：
1、静态不能直接访问非静态。
原因：在内存中先有的静态内容，后有的非静态内容。
"先人不知道后人，但是后人知道先人"
2、静态方法当中不能用this。
原因：this表示当前对象，通过谁调用的方法，谁就是当前对象。
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();
        //对于静态方法来说，既可以通过对象名进行调用，也可以通过类名进行调用
        MyClass.methodStatic();


        myMethod();//正确，不推荐。对于本类当中的静态方法，可以省略类名称直接调用，编译的时候编译器会自动翻译成类名称调用的方式
        Demo02StaticMethod.myMethod();//正确，推荐。和上面完全等效
    }

    public static void myMethod() {
        System.out.println("我的方法！");
    }
}
