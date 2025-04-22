package com.jobrecommendation;

import javax.swing.*;
import java.awt.event.*;

public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        setTitle("Register");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel skillsLabel = new JLabel("Skills:");
        JTextField skillsField = new JTextField();

        JButton registerButton = new JButton("Register");
        JButton goToLoginButton = new JButton("Go to Login");

        nameLabel.setBounds(20, 20, 80, 25);
        nameField.setBounds(100, 20, 160, 25);
        emailLabel.setBounds(20, 60, 80, 25);
        emailField.setBounds(100, 60, 160, 25);
        skillsLabel.setBounds(20, 100, 80, 25);
        skillsField.setBounds(100, 100, 160, 25);
        registerButton.setBounds(100, 140, 100, 30);
        goToLoginButton.setBounds(100, 180, 100, 25);

        add(nameLabel); add(nameField);
        add(emailLabel); add(emailField);
        add(skillsLabel); add(skillsField);
        add(registerButton); add(goToLoginButton);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String skills = skillsField.getText();

            if (!name.isEmpty() && !email.isEmpty() && !skills.isEmpty()) {
                User user = new User(name, email, skills);
                JOptionPane.showMessageDialog(this, "Registration successful!");
                new DashboardFrame(user).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            }
        });

        goToLoginButton.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}