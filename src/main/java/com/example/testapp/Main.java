package com.example.testapp;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("jDeploy Test App v1.0.17");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JLabel label = new JLabel("Hello from jDeploy Test App!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
