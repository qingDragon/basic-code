package com.s0cket.day14.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法：
        public static <T> void sort(List<T> list, Comparator<? super T>) : 将集合中元素按照指定规则排序。

    Comparator和Comparable的区别
        Comparable:自己（this)和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判，比较两个
    Comparator的排序规则：
        o1 - o2 : 升序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println("排序前：" + list01);

        Collections.sort(list01, new Comparator<Integer>() {
            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // 升序
            }
        });
        System.out.println("排序后：" + list01);


        ArrayList<Student> list02 = new ArrayList<>();
        Student p1 = new Student("b玛尔扎哈",16);
        Student p2 = new Student("a迪丽热巴",16);
        Student p3 = new Student("古力娜扎",19);
        Student p4 = new Student("阿里巴巴",12);

        Collections.addAll(list02, p1,p2,p3,p4);
        System.out.println("排序前：" + list02);

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if(result==0){
                    return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println("排序后：" + list02);
    }
}
