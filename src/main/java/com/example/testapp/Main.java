package com.example.testapp;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("jDeploy Test App v1.0.11");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel(new BorderLayout());

            JLabel label = new JLabel("Hello from jDeploy Test App!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(label, BorderLayout.CENTER);

            JLabel versionLabel = new JLabel("Version 1.0.11 - Authenticode Signing Test", SwingConstants.CENTER);
            versionLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            panel.add(versionLabel, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
