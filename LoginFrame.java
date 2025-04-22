package com.jobrecommendation;

import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel skillsLabel = new JLabel("Skills:");
        JTextField skillsField = new JTextField();

        JButton loginButton = new JButton("Login");

        emailLabel.setBounds(20, 20, 80, 25);
        emailField.setBounds(100, 20, 160, 25);
        nameLabel.setBounds(20, 50, 80, 25);
        nameField.setBounds(100, 50, 160, 25);
        skillsLabel.setBounds(20, 80, 80, 25);
        skillsField.setBounds(100, 80, 160, 25);
        loginButton.setBounds(100, 120, 100, 30);

        add(emailLabel); add(emailField);
        add(nameLabel); add(nameField);
        add(skillsLabel); add(skillsField);
        add(loginButton);

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String name = nameField.getText();
            String skills = skillsField.getText();

            if (!email.isEmpty() && !name.isEmpty() && !skills.isEmpty()) {
                User user = new User(name, email, skills);
                new DashboardFrame(user).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all fields.");
            }
        });
    }
}