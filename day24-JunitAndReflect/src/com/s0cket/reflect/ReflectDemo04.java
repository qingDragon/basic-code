package com.s0cket.reflect;

import com.s0cket.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // 获取Person的Class对象
        Class personClass = Person.class;
        /**
         * Method[] getMethods()
         * Method getMethod(String name, Class<?>... parameterTypes)
         * Method[] getDeclaredMethods()
         * Method getDeclaredMethod(String name, Class<?>... parameterTypes)
         */
        // 获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        // 执行方法，参数传递类的对象
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        // 执行方法，参数传递类的对象和方法传递的参数
        eat_method2.invoke(p,"雪糕");

        System.out.println("=====================");

        // 获取所有public 修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            // 打印所有public修饰的方法，包括其父类Object的
            System.out.println(method);
            // 获取方法的名称
            String name = method.getName();
            System.out.println(name);
            // 方法也是可以设置权限的
            //method.setAccessible(true);
        }
        // 获取类名(绝对名称）
        String calssName = personClass.getName();
        System.out.println(calssName);//com.s0cket.domain.Person
    }
}
