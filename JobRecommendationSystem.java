package com.jobrecommendation;

public class JobRecommendationSystem {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new RegisterFrame().setVisible(true); // Start with registration
        });
    }
}