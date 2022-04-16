package com.s0cket.reflect;


import com.s0cket.domain.Person;

public class ReflectDemo01 {
    /**
     * Class.forName("全类名")：将字节码文件加载进内存，返回Class对象。使用场景：多用于配置文件，将类名定义在配置文件中。读取文件，加载类。
     * 类名.class：通过类名的属性class获取。使用场景：多用于参数的传递。
     * 对象.getClass()：getClass()方法在Object类中定义着。使用场景：多用于对象获取字节码的方式。
     */
    public static void main(String[] args) throws Exception {
        // Class.forName("全类名")
        Class cls1 = Class.forName("com.s0cket.domain.Person");
        System.out.println(cls1);
        // 类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        // 对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        // 判断获取到的class对象是不是同一个
        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
    }
}
