package com.chattinader.projects.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;

public class User {

    @Id
    private final String id;
    @NotBlank
    private final String username;
    @NotBlank
    private final String password;
    @NotBlank
    private final String email;
    @NotBlank
    private final String name;
    @NotBlank
    private final String birthDate;
    @NotBlank
    private final char gender;

    public User(@JsonProperty("id") String id,
                @JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("email") String email,
                @JsonProperty("name") String name,
                @JsonProperty("birthDate") String birthDate,
                @JsonProperty("gender") char gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

}
