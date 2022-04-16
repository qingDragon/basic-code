package com.s0cket.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 框架类：使用注解来代替配置文件，通过反射来调用类中方法
 */
@Pro(className = "com.s0cket.annotation.Demo01", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 1.获取该类的字节码文件对象
        Class reflectTestClass = ReflectTest.class;
        // 2.获取该类的注解对象
        /*
            getAnnotation(Class) 其实是在内存中生成了该注解接口的实现类对象
            public class ProImpl implements Pro(){
                @Override
                public String className(){
                    return "com.s0cket.annotation.Demo01";
                }
                @Override
                public String methodName(){
                    return "show";
                }
            }
         */
        // 需要强制转换
        Pro an = (Pro) reflectTestClass.getAnnotation(Pro.class);
        // 3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        // 4.加载该类进内存
        Class cls = Class.forName(className);
        // 5.创建对象
        Object obj = cls.getConstructor().newInstance();
        // 6.获取方法对象
        Method method = cls.getMethod(methodName);
        // 7.执行方法
        method.invoke(obj);
    }

}
