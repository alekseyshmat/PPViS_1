package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main implements ItemListener {
    private static FirstTask first = new FirstTask();
    private static SecondTask second = new SecondTask();
    private static ThirdTask third = new ThirdTask();
    private static ForthTask forth = new ForthTask();
    private static FifthTask fifth = new FifthTask();
    private static JFrame frame = new JFrame();
    private static JPanel cardPanel = new JPanel();
    private static JPanel cards;


    private static void FlowLayout() {
        frame.setPreferredSize(new Dimension(1200,400));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton buttonStart = new JButton("Start");
        frame.add(buttonStart);

        first.First();
        frame.add(first.panel);

        second.Second();
        frame.add(second.panel);

        third.Third();
        frame.add(third.panel);

        forth.Forth();
        frame.add(forth.panel);

        fifth.Fifth();
        frame.add(fifth.panel);
    }

    private static void GridBagLayout(Container container) {
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        container.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0;
        constraints.gridy = 0;

        first.First();
        constraints.fill=GridBagConstraints.HORIZONTAL;
        constraints.gridx =1;
        container.add(first.panel,constraints);

        second.Second();
        constraints.gridx = 2;
        container.add(second.panel,constraints);

        third.Third();
        constraints.gridx = 3;
        container.add(third.panel,constraints);

        forth.Forth();
        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(forth.panel,constraints);

        fifth.Fifth();
        constraints.gridx = 2;
        constraints.gridy = 1;
        container.add(fifth.panel,constraints);
    }

    public static void CardLayout1(Container container){
        String FirstTask = "Первое задание";
        String SecondTask = "Второе задание";
        String ThirdTask = "Третье задание";
        String ForthTask = "Четвертое задание";
        String FifthTask = "Пятое задание";
        JComboBox<String> comboBox = new JComboBox<String>(new String[] {FirstTask, SecondTask, ThirdTask, ForthTask, FifthTask});
        cardPanel.add(comboBox);

        cards = new JPanel(new CardLayout());

        JPanel card1 = new JPanel();
        JButton button = new JButton("ок");
        //card1.add(button);

        cards.add(first.addPanel,FirstTask);
        cards.add(second.changePanel,SecondTask);
        cards.add(third.radioPanel,ThirdTask);
        cards.add(forth.panel,ForthTask);
        cards.add(fifth.panel,FifthTask);

        container.add(cardPanel,BorderLayout.PAGE_START);
        container.add(cards,BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent event)
    {
        CardLayout layout = (CardLayout)(cards.getLayout());
        layout.show(cards, (String)event.getItem());
    }
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CardLayout1(frame.getContentPane());
                //GridBagLayout(frame.getContentPane());
                //FlowLayout();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
