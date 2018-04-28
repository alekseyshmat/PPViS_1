package com.company;
import java.awt.*;
import javax.swing.*;

public class BoxLayout extends JFrame{
    public FirstTask first = new FirstTask();
    public SecondTask second = new SecondTask();
    public ThirdTask third = new ThirdTask();
    public ForthTask forth = new ForthTask();
    public FifthTask fifth = new FifthTask();
    public JFrame frame = new JFrame();

    public void BoxLayout(){
        frame.setLayout(new javax.swing.BoxLayout(frame, javax.swing.BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setPreferredSize(new Dimension(1000, 300));

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
    }
}
