package com.company;

import java.awt.*;
import javax.swing.*;

public class BorderLayout extends JFrame {
    private JFrame frame = new JFrame("BorderLayout");
    private FirstTask first = new FirstTask();
    private SecondTask second = new SecondTask();
    private ThirdTask third = new ThirdTask();
    private ForthTask forth = new ForthTask();
    private FifthTask fifth = new FifthTask();
    private long time = 2500;
    public Thread th1;

    public void BorderLayout() {
        frame.setLayout(new java.awt.BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 300));

        first.First();
        frame.add(first.addPanel, java.awt.BorderLayout.NORTH);

        second.Second();
        frame.add(second.changePanel, java.awt.BorderLayout.WEST);

        third.Third();
        frame.add(third.radioPanel, java.awt.BorderLayout.EAST);

        forth.Forth();
        frame.add(forth.checkPanel, java.awt.BorderLayout.SOUTH);

        fifth.Fifth();
        frame.add(fifth.tablePanel, java.awt.BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(time);
                    frame.setVisible(false);
                } catch (InterruptedException e) {
                    System.out.println("Border stop");
                }
            }
        });
        th1.start();
    }
}
