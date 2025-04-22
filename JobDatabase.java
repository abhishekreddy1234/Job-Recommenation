package com.jobrecommendation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JobDatabase {
    private List<Job> jobs = new ArrayList<>();

    public JobDatabase() {
        // Sample jobs
        jobs.add(new Job("Java Developer", "TCS", "Mumbai", "Java, Spring"));
        jobs.add(new Job("Web Developer", "Infosys", "Bangalore", "HTML, CSS, JavaScript"));
        jobs.add(new Job("Data Scientist", "Google", "Hyderabad", "Python, Machine Learning"));
        jobs.add(new Job("Backend Developer", "Amazon", "Chennai", "Node.js, MongoDB"));
        jobs.add(new Job("Mobile Developer", "Flipkart", "Pune", "Kotlin, Android"));
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public List<Job> recommendJobs(String userSkills) {
        return jobs.stream()
                .filter(job -> job.getSkillsRequired().toLowerCase().contains(userSkills.toLowerCase()))
                .collect(Collectors.toList());
    }
}