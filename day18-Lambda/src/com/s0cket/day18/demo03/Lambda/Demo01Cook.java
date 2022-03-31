package com.s0cket.day18.demo03.Lambda;

/*
    练习：Lambda标准格式（无参无返回值）
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，无参数无返回值
        使用Lambda的标准格式调用invokeCook方法，打印输出"吃饭啦！"字样

 */
public class Demo01Cook {
    public static void main(String[] args) {
        // 匿名内部类方式
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦");
            }
        });
        // Lambda表达式方式
        invokeCook(()->{
            System.out.println("吃饭啦");
        });
    }

    // 定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
