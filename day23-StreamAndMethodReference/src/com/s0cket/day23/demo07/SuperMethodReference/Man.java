package com.s0cket.day23.demo07.SuperMethodReference;

public class Man extends Human {
    // 子类重写父类的成员方法
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }
    // 定义一个方法参数传递函数式接口
    public void method(Greetable g) {
        g.greet();
    }
    public void show() {
        //// 调用method方法，方法的参数Greetable是一个函数式接口，可传递Lambda表达式
        //method(()->{
        //    // 创建父类对象
        //    Human h = new Human();
        //    // 调用父类的sayHello方法
        //    h.sayHello();
        //});
        // 使用关键字super优化Lambda
        method(()->{super.sayHello();});

        // 使用方法引用：super已经存在，父类的成员方法sayHello已经存在
        method(super::sayHello);
    }
    public static void main(String[] args) {
        new Man().show();//Hello 我是Human!
    }
}
