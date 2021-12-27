package com.s0cket.day11.demo04;
/*
如果一个类是定义在一个方法内部的，那么这个类就是个局部内部类。
"局部"：只有当前方法内部才能使用，出了这个方法就无法访问了。

定义格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 方法名称(参数列表) {
        class 局部内部类名称{
            // ...
        }
    }
}

小结一下权限修饰符：
public > protected > (default) > private
定义一个类的时候，权限修饰符规则：
1、外部类：public/(default)
2、成员内部类：public / protected / (default) / private
3、局部内部类：什么都不写
 */
public class DemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();// 10
    }
}
