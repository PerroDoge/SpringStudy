package com.mws.proxy;

public class Person implements Eatable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void eat(String foodName) {
        System.out.println(name + "正在家吃" + foodName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}