package com.s0cket.reflect;

import com.s0cket.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        // 获取Person的Class对象
        Class personClass = Person.class;
        /**
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(Class<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
         */

        //Constructor<?>[] getConstructors()
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        // Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象
        Object person = constructor.newInstance("赵晓", 18);
        System.out.println(person);

        // 使用无参构造方法创建对象
        Object person1 = personClass.getConstructor().newInstance(); // 不可以简化成类对象.newInstance();
        System.out.println(person1);
    }
}
