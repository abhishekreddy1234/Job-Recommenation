package com.jobrecommendation;

public class Job {
    private String title;
    private String company;
    private String location;
    private String skillsRequired;

    public Job(String title, String company, String location, String skillsRequired) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.skillsRequired = skillsRequired;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    @Override
    public String toString() {
        return title + " at " + company + " (" + location + ") - Skills: " + skillsRequired;
    }
}