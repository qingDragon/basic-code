package com.s0cket.day11.demo6;

public class DemoMain {
    public static void main(String[] args) {


        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);

        hero.attack();
    }
}
