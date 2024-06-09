package com.xiaobo.csleeve.sample.hero;

import com.xiaobo.csleeve.sample.ISkill;


public class Diana implements ISkill {
    private String name;
    private Integer age;
    public Diana() {
        System.out.println("Hello Diana");
    }
    public Diana(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void Q() {
        System.out.println("Diana Q");
    }
    public void W() {
        System.out.println("Diana W");
    }

    public void E() {
        System.out.println("Diana E");
    }

    public void R() {
        System.out.println("Diana R");
    }
}
