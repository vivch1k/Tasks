package ru.mirea.lab5.ex1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;
    JLabel label3;

    int milan = 0;
    int madrid = 0;
    String last_score = "";
    String winner = "";
    Frame() {

        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        button1.setBounds(130, 100, 110, 20);
        button2.setBounds(240, 100, 110, 20);
        button1.addActionListener(this);
        button2.addActionListener(this);

        label1 = new JLabel("Result: " + milan + " X " + madrid);
        label2 = new JLabel("Last Scorer: " + last_score);
        label3 = new JLabel("Winner: " + winner);
        JLabel label4 = new JLabel();

        label1.setSize(100, 20);
        label2.setSize(100, 20);
        label3.setSize(110, 20);

        label1.setBounds(200, 200, 100, 20);
        label2.setBounds(200, 220, 150, 20);
        label3.setBounds(200, 240, 150, 20);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            milan += 1;
            last_score = "AC Milan";
            winner = "AC Milan";
            label1.setText("Result:" + milan + " X " + madrid);
            label2.setText("Last Scorer: " + last_score);
            if (milan > madrid)
                label3.setText("Winner: " + winner);
        }
        else if(e.getSource()==button2) {
            madrid += 1;
            last_score = "Real Madrid";
            winner = "Real Madrid";
            label1.setText("Result:" + milan + " X " + madrid);
            label2.setText("Last Scorer: " + last_score);
            if (madrid > milan)
                label3.setText("Winner: " + winner);
        }
    }
}
