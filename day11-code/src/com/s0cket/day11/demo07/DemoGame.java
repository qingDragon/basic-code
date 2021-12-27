package com.s0cket.day11.demo07;

import com.s0cket.day11.demo07.Hero;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        // 设置英雄名称
        hero.setName("艾希");

        // 设置英雄技能
        hero.setSkill(new SkillImpl());

        hero.attack();
    }
}
