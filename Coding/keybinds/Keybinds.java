package Coding.keybinds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Keybinds extends Thingy {

    public Keybinds() {
            // Set up the JFrame
            setTitle("Key Bindings Example");
            setSize(0, 0);
            setDefaultCloseOperation(Thingy.EXIT_ON_CLOSE);

            // Panel to hold key bindings
            JPanel panel = new JPanel();
            getContentPane().add(panel);

            // Bind 'A' key to an action
            panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "A_PRESSED");
            panel.getActionMap().put("A_PRESSED", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("A key pressed!");
                }
            });

            // Bind 'Escape' key to an action
            panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESC_PRESSED");
            panel.getActionMap().put("ESC_PRESSED", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Escape key pressed!");
                }
            });

            setVisible(true);
        }

        public static void main (String[]args){
            new Keybinds();
        }
    }

