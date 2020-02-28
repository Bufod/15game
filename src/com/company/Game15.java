package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game15 extends JFrame {
    private JPanel basePanel = new JPanel(
            new GridLayout(4, 4, 2, 2));

    private int[][] numbers = new int[4][4];

    public Game15() {
        super("Пятнашки Николая");

        setBounds(200, 200, 300, 300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createMenu();

        Container container = getContentPane();
        basePanel.setDoubleBuffered(true);
        container.add(basePanel);


    }

    private void generate(){
        Random generator = new Random();
        int[] invariants = new int[16];



    }

    private boolean canBeSolved(int[] invariants){
        int sum = 0;
        for (int i = 0; i < 16; i++){
            if (invariants[i] == 0){
                sum += i/4;
                continue;
            }

            for (int j = i + 1; j < 16; j++){
                if (invariants[j] < invariants[i])
                    sum++;
            }
        }

        System.out.println(sum % 2 == 0);
        return sum % 2 == 0;
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
