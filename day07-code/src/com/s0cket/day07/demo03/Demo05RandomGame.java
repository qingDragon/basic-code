package com.s0cket.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
题目：
猜数字，10次机会，猜中游戏结束，10次猜不中也结束！
 */
public class Demo05RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("请输入你猜的数字：");
            int guessNum = sc.nextInt();
            if(guessNum > randomNum) {
                System.out.println("猜大了，请重试！");
            } else if (guessNum < randomNum) {
                System.out.println("猜小了，请重试！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            if(i == 9) {
                System.out.println("你已经猜了10次没猜中，游戏结束！");
            }
        }
    }
}
