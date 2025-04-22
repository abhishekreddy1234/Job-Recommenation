package com.jobrecommendation;

public class User {
    private String name;
    private String email;
    private String skills;

    public User(String name, String email, String skills) {
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSkills() {
        return skills;
    }
}