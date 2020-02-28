package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game15 extends JFrame {
    private JPanel container = new JPanel(
            new GridLayout(4, 4, 2, 2));

    private int[][] numbers = new int[4][4];

    public Game15() {
        super("Пятнашки Николая");

        setBounds(200, 200, 300, 300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createMenu();



    }

    private void createMenu() {
        JMenuBar menu = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        for (String fileItem : new String[]{"New Game",
                "Exit"}){
            JMenuItem item = new JMenuItem(fileItem);
            item.setActionCommand(fileItem.toLowerCase());
            item.addActionListener(new NewMenuListner());
            fileMenu.add(item);
        }

        fileMenu.insertSeparator(1);

        menu.add(fileMenu);
        setJMenuBar(menu);
    }

    private class NewMenuListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("new game")){

            }
            if (command.equals("exit")){
                System.exit(0);
            }
        }
    }
}
