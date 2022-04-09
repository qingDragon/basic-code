package com.s0cket.day23.demo08.ThisMethodReference;
/*
    通过this引用本类的成员方法
 */
public class Husband {
    // 定义一个买房子的方法
    public void buyHouse() {
        System.out.println("北京二环内买一套四合院！");
    }

    // 定义一个结婚的方法，参数传递Richable接口
    public void marry(Richable r) {
        r.buy();
    }
    // 定义一个非常高兴的方法
    public void soHappy(){
        // 调用结婚的方法
        //marry(()->{
        //    // 使用this调用本类的成员方法
        //    this.buyHouse();
        //});

        // 使用方法引用优化：this是已经存在的，成员方法buyHouse是已经存在的
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
