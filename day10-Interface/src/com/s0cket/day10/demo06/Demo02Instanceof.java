package com.s0cket.day10.demo06;

/*
如何才能知道一个父类引用的对象，原来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean结果,也就是判断前面的对象能不能做后面类的实例。


 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();// 猫吃鱼

        // 如果希望使用子类特有方法，需要向下转型
        // 判断一下父类引用的animal 是不是Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHome();
        }
        giveMeAPet(animal);
    }
    // istanceof 作用就是在父类作为方法参数时，对父类引用进行判断，向下转型后调用子类独有的方法
    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHome();
        }
    }
}
