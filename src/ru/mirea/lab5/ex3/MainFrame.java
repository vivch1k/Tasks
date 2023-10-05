package ru.mirea.lab5.ex3;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JLabel imgLabel;
    private String path;
    private MainFrame(String path) {
        this.path = path;
        this.setSize(500, 500);

        imgLabel = new JLabel("", new ImageIcon(getClass().getResource(path)), SwingConstants.CENTER);

        getContentPane().add(imgLabel);
    }


    public static void main(String[] args) {
        String path = args[0];
        MainFrame mf = new MainFrame(path);
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }

}
