package Coding.keybinds;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JLabel;

public class Thingy extends JFrame {

        public static void main(String[] args) {
            // Create a JFrame
            JFrame frame = new JFrame("Video Game");

            // Set size
            frame.setSize(400, 300);

            // Add a label
            JLabel label = new JLabel("Hello, JFrame!", SwingConstants.CENTER);
            frame.add(label);
            label.setForeground(Color.WHITE);

            // Set default close operation
            frame.setDefaultCloseOperation(Thingy.EXIT_ON_CLOSE);

            frame.getContentPane().setBackground(Color.BLACK);

            JTextArea textArea = new JTextArea();
            textArea.setText("You chose Barbarian, you fight with rage and brute force to defeat your enemies.\n" +
                    "Your hit die is 1d12. You are proficient with:\n" +
                    "- Light armor\n" +
                    "- Medium armor\n" +
                    "- Shields\n" +
                    "- Simple weapons\n" +
                    "- Martial weapons\n" +
                    "\nChoose some starting equipment:\n" +
                    "1. A greataxe\n" +
                    "2. Any martial weapon");

            // Make the text area read-only
            textArea.setEditable(false);

            // Set font and text wrapping
            textArea.setFont(new Font("Arial", Font.PLAIN, 14));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);

            // Add the text area inside a JScrollPane
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Add the scroll pane to the frame



            // Make the frame visible
            frame.setVisible(true);
        }
    }

