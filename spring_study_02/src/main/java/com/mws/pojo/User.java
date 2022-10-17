package com.mws.pojo;


public class User {
    private String name;
    public User() {
        System.out.println("NoArgsConstructor invoked");
    }

    public User(String name) {
        this.name = name;
        System.out.println("AllArgsConstructor invoked");
    }

    public void setName(String name) {
        System.out.println("Setting Method invoked");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void initUser() {
        System.out.println("initUser invoked");
    }
    public void destroyUser() {
        System.out.println("destroyUser invoked");
    }
}
