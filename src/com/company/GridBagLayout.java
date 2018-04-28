package com.company;

import javax.swing.*;
import java.awt.*;

public class GridBagLayout {
    private FirstTask first = new FirstTask();
    private SecondTask second = new SecondTask();
    private ThirdTask third = new ThirdTask();
    private ForthTask forth = new ForthTask();
    private FifthTask fifth = new FifthTask();
    private JFrame frame = new JFrame("GridBagLayout");

    public void GridBagLayout(Container container) {
        frame.setPreferredSize(new Dimension(1000, 300));
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        container.setLayout(new java.awt.GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0;
        constraints.gridy = 0;

        first.First();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        container.add(first.addPanel, constraints);

        second.Second();
        constraints.gridx = 2;
        container.add(second.changePanel, constraints);

        third.Third();
        constraints.gridx = 3;
        container.add(third.radioPanel, constraints);

        forth.Forth();
        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(forth.checkPanel, constraints);

        fifth.Fifth();
        constraints.gridx = 2;
        constraints.gridy = 1;
        container.add(fifth.tablePanel, constraints);
        frame.setLocationRelativeTo(null);
    }
}
