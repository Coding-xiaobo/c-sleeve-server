package com.xiaobo.csleeve.sample.hero;

import com.xiaobo.csleeve.sample.ISkill;


public class Irelia implements ISkill {
    private String name;
    private Integer age;
    public Irelia() {
        System.out.println("Hello Irelia");
    }
    public Irelia(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void Q() {
        System.out.println("Irelia Q");
    }
    public void W() {
        System.out.println("Irelia W");
    }

    public void E() {
        System.out.println("Irelia E");
    }

    public void R() {
        System.out.println("Irelia R");
    }
}
