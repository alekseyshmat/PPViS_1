package com.company;

import java.awt.*;
import javax.swing.*;

public class FlowLayout extends JFrame {
    private FirstTask first = new FirstTask();
    private SecondTask second = new SecondTask();
    private ThirdTask third = new ThirdTask();
    private ForthTask forth = new ForthTask();
    private FifthTask fifth = new FifthTask();
    private JFrame frame = new JFrame("FlowLayout");
    public Thread th;
    private long time = 2500;

    public void FlowLayout() {
        frame.setPreferredSize(new Dimension(1000, 300));
        frame.setLayout(new java.awt.FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first.First();
        frame.add(first.addPanel);

        second.Second();
        frame.add(second.changePanel);

        third.Third();
        frame.add(third.radioPanel);

        forth.Forth();
        frame.add(forth.checkPanel);

        fifth.Fifth();
        frame.add(fifth.tablePanel);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(time);
                    frame.setVisible(false);
                } catch (InterruptedException e) {
                    System.out.println("flow stop");
                }
            }
        });
        th.start();
    }
}
