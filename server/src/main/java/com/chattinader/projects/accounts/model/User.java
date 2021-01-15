package com.chattinader.projects.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String username;
    private final String password;
    private final String name;
    private final int age;
    private final char gender;

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("name") String name,
                @JsonProperty("age") int age,
                @JsonProperty("gender") char gender) {
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

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
