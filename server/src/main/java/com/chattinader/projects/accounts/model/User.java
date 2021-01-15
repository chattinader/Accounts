package com.chattinader.projects.accounts.model;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String username;
    private final String password;
    private final String name;
    private final double age;
    private final char gender;

    public User(UUID id, String username, String password, String name, double age, char gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
