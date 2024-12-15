package Coding.keybinds;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import Coding.Choosing_your_Class;
import Coding.Choosing_your_Race;

public class Keybinds_For_Race_Choice extends JFrame {
private JLabel label;
    public Keybinds_For_Race_Choice() {
            // Set up the JFrame
            setTitle("Key Bindings Example");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            // Panel to hold key bindings
            JPanel panel = new JPanel();
            getContentPane().add(panel);
            panel.add(new JLabel(""));

            // Bind 'A' key to an action
            panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0), "1_PRESSED");
            panel.getActionMap().put("1_PRESSED", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        if (Choosing_your_Race.Section == 1) {
                            System.out.println("You chose Barbarian, you fight with rage and brute force to defeat your enemies.");
                            System.out.println("Your hit die is 1d12, you are proficient with light armor, medium armor, shields, simple weapons, and martial weapons");
                            System.out.println("Choose some starting equipment");
                            System.out.println("1. A greataxe");
                            System.out.println("2. Any martial weapon");

                        }
                        if (Choosing_your_Race.Section == 3) {
                            System.out.println("");
                            System.out.println("You chose Human, your stats are 11 Str, 11 Dex, 11 Con, 11 Wis, 11 Int, 11 Cha");
                        }
                }
            });

            panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0), "2_PRESSED");
             panel.getActionMap().put("2_PRESSED", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Choosing_your_Race.Section == 1) {
                    System.out.println("You chose cleric, you use the power of the gods to carry out their will.");
                    System.out.println("Your hit die is 1d8, you are proficient with light armor, medium armor, shields, and simple weapons.");
                    System.out.println("Choose some starting equipment");
                    System.out.println("1. A mace");
                    System.out.println("2. A warhammer");
                }
                if (Choosing_your_Race.Section == 3) {
                    System.out.println("");
                    System.out.println("You chose elf, your stats are 10 Str, 12 Dex, 10 Con, 10 Wis, 11 Int, 10 Cha2");
                }
                 }
             });

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "3_PRESSED");
        panel.getActionMap().put("3_PRESSED", new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    if (Choosing_your_Race.Section == 1) {
                        System.out.println("You chose Druid, you are a master of nature and a friend of beasts");
                        System.out.println("You are proficient in light and medium armors as well as shields");
                        System.out.println("You are also proficient in a number of fine weapons.");
                        System.out.println("These include clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, and spears.");
                        System.out.println("chose your starting equipment");
                        System.out.println("1. A wooden shield");
                        System.out.println("2. a simple melee weapon");
                    }
                    }
                });

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0), "4_PRESSED");
        panel.getActionMap().put("4_PRESSED", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Choosing_your_Race.Section == 1) {
                    System.out.println("You chose fighter, you are a specialist in all forms of melee combat.");
                    System.out.println("Your hit die is 1d10, you are proficient with all armor and shields as well as all simple and martial weapons.");
                    System.out.println("Choose some starting equipment");
                    System.out.println("1. chain mail");
                    System.out.println("2. Leather armor, a longbow, and 20 arrows");
                }
            }
        });

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "5_PRESSED");
        panel.getActionMap().put("5_PRESSED", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Choosing_your_Race.Section == 1) {
                    System.out.println("You chose Ranger, you will often use your bow and arrow to defeat opponents");
                    System.out.println("Your hit die is a 1d10");
                    System.out.println("You are proficient with light and medium armors");
                    System.out.println("You are also proficient with simple and martial weapons");
                    System.out.println("now it is time to chose your starting equipment");
                    System.out.println("1. Scale Mail");
                    System.out.println("2. Leather Armor");
                }
            }
        });

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "6_PRESSED");
        panel.getActionMap().put("6_PRESSED", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Choosing_your_Race.Section == 1) {
                    System.out.println("You chose Rogue, you specalize in stealth");
                    System.out.println("Your Hit die is a 1d8, you are proficient in simple weapons, Hand Crossbows, Longswords, Rapiers, and Shortswords");
                    System.out.println("now you need to chose your starting equipment");
                    System.out.println("1. Rapier");
                    System.out.println("2. Shortsword");
                }
            }
        });

        panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "7_PRESSED");
        panel.getActionMap().put("7_PRESSED", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Choosing_your_Race.Section == 1) {
                    System.out.println("You chose Wizard, You use intelligence and wisdom instead of strength in battle");
                    System.out.println("Your hit die is one 1d6, you are proficient with daggers, darts, slings, quarter staffs, and light crossbows ");
                    System.out.println("As a Wizard sadly you can not wear any armor whatsoever so be careful");
                    System.out.println("Choose some starting equipment");
                    System.out.println("1. Quarter staff, component pouch, and a spellbook");
                    System.out.println("2. Dagger, arcane focus, and a spellbook");
                }
            }
        });


            setVisible(true);
        }

        public static void main (String[]args){
            new Keybinds_For_Race_Choice();
        }
    }

