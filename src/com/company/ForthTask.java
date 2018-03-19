package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForthTask{
    public  JPanel panel = new JPanel();
    private JPanel checkPanel = new JPanel();
    private JTextField text4 = new JTextField();
    private JButton button4 = new JButton("Start");
    private JCheckBox checkBox1 = new JCheckBox("1");
    private JCheckBox checkBox2 = new JCheckBox("2");
    private JCheckBox checkBox3 = new JCheckBox("3");

    public void Forth(){
        panel.setPreferredSize(new Dimension( 400,70));
        text4.setPreferredSize(new Dimension(120, 30));
        button4.setPreferredSize(new Dimension(100, 30));

        checkPanel.add(text4);
        checkPanel.add(button4);
        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        checkPanel.add(checkBox3);
        panel.add(checkPanel);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text4.getText().isEmpty()) {
                    if(text4.getText().equals(checkBox1.getText()))
                        checkBox1.doClick();
                    else if(text4.getText().equals(checkBox2.getText()))
                        checkBox2.doClick();
                    else if(text4.getText().equals(checkBox3.getText()))
                        checkBox3.doClick();
                    else
                        JOptionPane.showMessageDialog(null, "Такого имени не существует ", "Внимание", JOptionPane.PLAIN_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Введите текст! ", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
