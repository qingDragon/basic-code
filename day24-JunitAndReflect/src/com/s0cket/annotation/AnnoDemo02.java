package com.s0cket.annotation;

/**
 * JDK中预定义的几个注解：
 *      * @Override: 检测被该注解标注的方法是否是继承自父类（接口）的
 *      * @Deprecated: 该注解标注的内容，表示已过时
 *      * @SuppressWarnings: 压制警告
 */
@SuppressWarnings("all")
public class AnnoDemo02 {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public void show01() {
        // 有缺陷，需要弃用
    }
    public void show02(){
        // 替代show01方法
    }
}
