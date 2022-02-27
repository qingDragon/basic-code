package com.s0cket.day16.demo03.Exception;

import java.util.List;

/*
    多个异常使用捕获的处理
    1、多个异常分别处理
    2、多个异常一次捕获，多次处理
    3、多个异常一次捕获，一次处理

 */
public class Demo01Exception {
    public static void main(String[] args) {
       //1、多个异常分别处理
//       try {
//           int[] arr = {1,2,3};
//           System.out.println(arr[3]); // 运行时异常
//       } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println(e);
//       }
//       try {
//           List<Integer> list = List.of(1,2,3);
//           System.out.println(list.get(3));
//       } catch (IndexOutOfBoundsException e) {
//           System.out.println(e);
//       }

       //2、多个异常一次捕获，多次处理
        /*
            一个try多个catch注意事项：
                catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
                ArrayIndexOutOfBoundsException exteds IndexOutOfBoundsException
                为什么会报错？


         */
       /* try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]); // 运行时异常
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }*/


        //3、一次捕获一次处理
        // 运行时异常可以不用拋出也可以不用处理
/*        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]); // 运行时异常
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        } catch (Exception e) {
            System.out.println(e);
        }*/

        // 运行时异常可以不用拋出也可以不用处理，虚拟机会处理但会终止程序

        int[] arr = {1,2,3};
        System.out.println(arr[3]); // 运行时异常
//        List<Integer> list = List.of(1,2,3);
//        System.out.println(list.get(3));

        System.out.println("后续代码");
    }

}
