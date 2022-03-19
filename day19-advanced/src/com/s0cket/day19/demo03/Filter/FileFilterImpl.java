package com.s0cket.day19.demo03.Filter;

import java.io.File;
import java.io.FileFilter;

/*
    创建过滤器FileFilter的实现类，重写过滤方法accept,定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
            过滤的规则：
                在accept方法中判断文件是否以".java"结尾
                是的话返回true,否就返回false
         */
        // 如果pathname是一个文件夹，则返回true，继续遍历这个文件夹
        if(pathname.isDirectory()){
            return true;
        }
        // 不是文件夹就是文件，将是否是java文件的判断结果返回
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
