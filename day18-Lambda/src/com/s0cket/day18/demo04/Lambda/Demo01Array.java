package com.s0cket.day18.demo04.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
    练习：
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

 */
public class Demo01Array {
    public static void main(String[] args) {
        // 创建数组
        Person[] arr = {
                new Person("迪丽热巴",22),
                new Person("古力娜扎",18),
                new Person("赵老师",23)
        };
        // 匿名内部类方式进行排序
/*        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        });*/

        // 使用标准Lambda表达式的参数和返回值方式
/*        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        */
        // Lambda的简化方式
        Arrays.sort(arr, (o1, o2) -> o1.getAge()-o2.getAge());

        // 遍历数组，打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
