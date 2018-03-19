package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdTask{
    public  JPanel panel = new JPanel();
    public  JPanel radioPanel = new JPanel();
    private JTextField text3 = new JTextField();
    private JButton button3 = new JButton("Start");
    private JRadioButton radioButton1 = new JRadioButton("1");
    private JRadioButton radioButton2 = new JRadioButton("2");
    private JRadioButton radioButton3 = new JRadioButton("3");
    private ButtonGroup buttonGroup = new ButtonGroup();

    public void Third() {
        panel.setPreferredSize(new Dimension( 330,70));
        text3.setPreferredSize(new Dimension(100, 30));
        button3.setPreferredSize(new Dimension(100, 30));

        radioPanel.add(text3);
        radioPanel.add(button3);
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        radioPanel.add(radioButton3);
        panel.add(radioPanel);

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text3.getText().isEmpty()) {
                    if (text3.getText().equals(radioButton1.getText()))
                        radioButton1.setSelected(true);
                    else if (text3.getText().equals(radioButton2.getText()))
                        radioButton2.setSelected(true);
                    else if (text3.getText().equals(radioButton3.getText()))
                        radioButton3.setSelected(true);
                    else
                        JOptionPane.showMessageDialog(null, "Такого имени не существует ", "Внимание", JOptionPane.PLAIN_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Введите текст! ", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
