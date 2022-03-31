package com.s0cket.day19.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;


/*
   获取目录下所有.java文件，我们还可以使用过滤器来实现

   在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
   File[] listFiles(FileFilter filter)
   java.io.FileFilter即可欧：用于抽象路径名（File对象）的过滤器。
        作用：用来过滤文件（File对象）
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数：
                File pathname:使用ListFiles方法遍历目录，得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
        作用： 用于过滤文件的方法
        抽象方法：用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件夹是否应该包含在某一文件列表中。
            参数：
                File dir:构造方法中传递的被遍历的目录
                String name:使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称

    注意：两个过滤器接口是乜有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中定义过滤的规则。
 */
public class Demo03Filter {
    public static void main(String[] args) {
        File f = new File("/Users/yanzhuang/Desktop/A");
        getAllFiles(f);
    }
    public static void getAllFiles(File pathname){
        /*
            传递过滤器
                此时的过滤器可以自动过滤出目录和.java结尾的File对象放置在File数组中
         */
        // 传递过滤器FileFilter，使用匿名内部类方式,Lambda表达式
        File[] files = pathname.listFiles(dir -> dir.isDirectory() || dir.getName().toLowerCase().endsWith(".java"));

        // 传递过滤器FilenameFilter，使用匿名内部类方式,Lambda表达式
//         File[] files = pathname.listFiles((dir,name) -> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java"));
        // 遍历File数组
        for (File file : files) {
            // 判断file对象是文件夹还是文件
            if(file.isDirectory()){
                // 如果File对象是目录的话，继续递归调用自身
                getAllFiles(file);
            }
            else {
                // 不是目录的话就是.java文件，打印输出
                System.out.println(file);
            }
        }
    }
}
