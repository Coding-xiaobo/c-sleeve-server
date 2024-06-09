package com.xiaobo.csleeve.sample.hero;

import com.xiaobo.csleeve.sample.ISkill;

public class Camile implements ISkill {
    private String skillName = "Camille R";
    private String name;
    private Integer age;
    public Camile(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void Q() {
        System.out.println("Camile Q");
    }
    public void W() {
        System.out.println("Camile W");
    }

    public void E() {
        System.out.println("Camile E");
    }

    public void R() {
        System.out.println("Camile R");
    }
}
