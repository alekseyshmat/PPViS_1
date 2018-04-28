package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondTask{
    public  JPanel panel = new JPanel();
    public JPanel changePanel= new JPanel();
    private JTextField text1 = new JTextField();
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");

    public void  Second() {
        panel.setPreferredSize(new Dimension( 270,70));
        text1.setPreferredSize(new Dimension( 120,30));
        button1.setPreferredSize(new Dimension(65, 30));
        button2.setPreferredSize(new Dimension(65, 30));

        changePanel.add(text1);
        changePanel.add(button1);
        changePanel.add(button2);
       // panel.add(changePanel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text1.getText().isEmpty())
                    button2.setText(text1.getText());
                else
                    JOptionPane.showMessageDialog(null, "Введите текст! ", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buf2 = button2.getText();
                button2.setText(button1.getText());
                button1.setText(buf2);
            }
        });
    }
}
