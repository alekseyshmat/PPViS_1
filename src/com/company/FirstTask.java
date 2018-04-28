package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstTask {
    public JPanel panel = new JPanel();
    public JPanel addPanel = new JPanel();
    private JTextField text = new JTextField();
    private JComboBox box = new JComboBox();
    private JButton button = new JButton("OK");

    public void First() {
        panel.setPreferredSize(new Dimension(330, 70));
        text.setPreferredSize(new Dimension(120, 30));
        box.setPreferredSize(new Dimension(80, 30));
        button.setPreferredSize(new Dimension(120, 30));

        addPanel.add(text);
        addPanel.add(box);
        addPanel.add(button);
        panel.add(addPanel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text.getText().isEmpty()) {
                    for (int j = 0; j < box.getItemCount(); j++)
                        if (text.getText().equals(box.getItemAt(j))) {
                            JOptionPane.showMessageDialog(null, "Такой объект уже есть ", "Внимание", JOptionPane.PLAIN_MESSAGE);
                            return;
                        }
                }
                box.addItem(text.getText());
            }
        });
    }
}
