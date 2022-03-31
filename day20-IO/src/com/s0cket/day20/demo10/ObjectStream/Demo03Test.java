package com.s0cket.day20.demo10.ObjectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    练习：序列化集合
    1、将存有多个自定义对象的集合序列化操作，保存到list.txt文件中。
    2、反序列化list.txt,并遍历集合，打印对象信息

    分析：
    1、把若干个学生对象，保存到集合中
    2、序列化集合
    3、反序列化堆区，再转换为集合对象
    4、遍历集合，打印学生信息
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day20-advanced/list.txt"));
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",22);
        Student stu2 = new Student("李四",22);
        Student stu3 = new Student("赵晓",18);
        Student stu4 = new Student("徐超",39);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day20-advanced/list.txt"));
        Object o = ois.readObject();
        ArrayList<Student> list2 = (ArrayList<Student>) o;
        for (Student student : list2) {
            System.out.println(student);
        }
        oos.close();
        ois.close();
    }
}
