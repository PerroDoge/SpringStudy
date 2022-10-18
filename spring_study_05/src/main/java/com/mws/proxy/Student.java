package com.mws.proxy;

public class Student implements Eatable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat(String foodName) {
        System.out.println(name + "正在食堂吃" + foodName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
