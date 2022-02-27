package com.s0cket.day14.demo03.HashCode;

/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）
    在Object类中有个方法，可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值

    hashCode方法的源码
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        // Person 类继承了Object类，所以可以使用Object的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);// 356573597


        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);// 1735600054

        /*
            toString方法的源码：
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);// com.s0cket.day14.demo03.HashCode.Person@1540e19d
        System.out.println(p2);// com.s0cket.day14.demo03.HashCode.Person@677327b6
        System.out.println(p1==p2);// false

        /*
            String类的哈希值
                Stirng类重写Object类的hashCode方法
         */

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        // 哈希冲突：不同的内容hashCode相同
        System.out.println("重地".hashCode());// 1179395
        System.out.println("通话".hashCode());// 1179395
    }
}

