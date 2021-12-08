package com.s0cket.day07.demo04;

import java.util.ArrayList;

/*
数组的长度是不可以发生改变；
但是ArrayList的长度是可以改变的。

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素全部都是统一的什么类型。
注意，泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，二是内容。
如果内容是空，得到的是空的中括号
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据。
        //备注：从JDK1.7+开始，右侧的尖括号可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);//[]

        //向集合中添加一些数据，需要用到add()方法
        list.add("赵丽颖");
        System.out.println(list);

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

        System.out.println(list);//[赵丽颖, 迪丽热巴, 古力娜扎, 马尔扎哈]
    }
}
