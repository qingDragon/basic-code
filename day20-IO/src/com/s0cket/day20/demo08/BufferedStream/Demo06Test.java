package com.s0cket.day20.demo08.BufferedStream;

import java.io.*;
import java.util.*;

/*
    练习：
        对文本的内容进行排序(in.txt),输出到文件out.txt中
        按照（1，2，3……）顺序排序
    分析：
        1、创建字符输入缓冲流对象，读取文件in.txt
        2、创建字符缓冲输入流对象，写入文件out.txt
        3、创建map集合，用来存储序号和内容
        4、创建list集合，用来存储序号并进行排序
        5、使用字符缓冲输入流按行读取字符串，并进行分割，将序号单独存储在list集合中，序号-内容存储在map集合中
        6、使用Collections.sort方法进行排序
        7、遍历list集合，通过list集合的内容查找map集合中的值并拼接成字符串
        8、将拼接的字符串写入到out.txt中
        9、释放资源

    注意：hashmap是可以自动按照key值排序的，不需要list集合了
         hashmap是按照hashcode编码进行从小到大的排序
 */
public class Demo06Test {
    public static void main(String[] args) throws IOException {
        //1、创建字符输入缓冲流对象，读取文件in.txt
        BufferedReader br = new BufferedReader(new FileReader("day20-advanced/in.txt"));
        //2、创建字符缓冲输入流对象，写入文件out.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("day20-advanced/out.txt"));
        //3、创建map集合，用来存储序号和内容
        HashMap<Integer,String> map = new HashMap<>();
        //4、创建list集合，用来存储序号并进行排序
        ArrayList<Integer> list = new ArrayList<>();
        //5、使用字符缓冲输入流按行读取字符串，并进行分割，将序号单独存储在list集合中，序号-内容存储在map集合中
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            // 转义字符要加上
            String[] str = line.split("\\.");
            list.add(Integer.parseInt(str[0]));
            map.put(Integer.parseInt(str[0]),str[1]);
        }
        //6、使用Collections.sort方法进行排序
        Collections.sort(list);
        //7、遍历list集合，通过list集合的内容查找map集合中的值并拼接成字符串
        for (Integer i : list) {
            String val = map.get(i);
            line = i + "." + val;
            System.out.println(i+"." + val);// 需要写入的信息
            //8、将拼接的字符串写入到out.txt中
            bw.write(line);
            bw.newLine();
        }
        //9、释放资源
        bw.close();
        br.close();
    }
}
