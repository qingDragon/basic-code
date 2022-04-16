package com.s0cket.reflect;


import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 需求:写一个"框架"，不能改变该类的任何代码的前提下，可以创建任意类的对象，并且执行其中的任意方法
 * 实现方式：配置文件和反射
 * 实现步骤：
 * 1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2.在程序中加载读取配置文件
 * 3.使用反射技术来加载类文件进内存
 * 4.创建对象
 * 5.执行方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 创建Properties对象
        Properties pro = new Properties();
        // 获取class目录下的配置文件
        // 需要注意的是配置文件一定要放在src目录下，否则会报空指针异常
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 加载该类进内存
        Class cls = Class.forName(className);
        // 创建对象
        Object obj = cls.getConstructor().newInstance();
        // 获取方法对象
        Method method = cls.getMethod(methodName);
        // 执行方法
        method.invoke(obj);
    }
}
