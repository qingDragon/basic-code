package com.s0cket.reflect;
import com.s0cket.domain.Person;
import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        // 获取Person的Class对象
        Class personClass = Person.class;
        //Field[] getFields()// 获取所有public修饰的成员变量
        //Field getField(String name)// 获取指定名称的public修饰的成员变量
        //Field[] getDeclaredFields()// 获取所有的成员变量，不考虑修饰符
        //Field getDeclaredField(String name)// 获取指定名称的成员变量，不考虑修饰符

        // 获取所有Public修饰的成员变量
        Field[] fields = personClass.getFields();
        for(Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------------");
        // Field getField(String name)
        Field a = personClass.getField("a");
        // 获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        // 设置a的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("==========================");

        //Field[] getDeclaredFields()// 获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //Field getDeclaredField(String name)// 获取指定名称的成员变量，不考虑修饰符
        Field d = personClass.getDeclaredField("name");
        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射-否则访问私有成员变量的时候会报java.lang.IllegalAccessException
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
