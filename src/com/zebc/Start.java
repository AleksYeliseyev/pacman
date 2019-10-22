package com.zebc;

import javax.swing.JFrame;

public class Start {
    public static void main(String[] args) {

        JFrame f = new JFrame("Java Pacman");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(580, 660); // game field 28x31
        f.setResizable(false);
        f.add(new GameField());
        f.setVisible(true);
    }
}
