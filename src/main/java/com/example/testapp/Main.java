package com.example.testapp;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static final String VERSION = "1.0.20";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("jDeploy Test App v" + VERSION);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JLabel label = new JLabel(
                    "<html><center>Hello from jDeploy Test App!<br>Version " + VERSION
                            + "</center></html>",
                    SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
