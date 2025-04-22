package com.jobrecommendation;

import javax.swing.*;
import java.util.List;

public class DashboardFrame extends JFrame {
    private JobDatabase jobDatabase = new JobDatabase();

    public DashboardFrame(User user) {
        setTitle("Welcome, " + user.getName());
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Recommended Jobs for: " + user.getSkills());
        welcomeLabel.setBounds(20, 20, 400, 25);
        add(welcomeLabel);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> jobList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(jobList);
        scrollPane.setBounds(20, 60, 440, 250);
        add(scrollPane);

        List<Job> recommendations = jobDatabase.recommendJobs(user.getSkills());
        if (recommendations.isEmpty()) {
            listModel.addElement("No matching jobs found.");
        } else {
            for (Job job : recommendations) {
                listModel.addElement(job.toString());
            }
        }
    }
}