package com.eisoft.moneyapp.main;

import javax.swing.*;

public class MoneyApp extends JFrame {
    private JPanel mainPanel;
    private JPanel barraCima;

    private static String title = "MoneyApp";

    public MoneyApp(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
    }

    public static void main(String[] args) {
        new MoneyApp(title).setVisible(true);
    }
}
