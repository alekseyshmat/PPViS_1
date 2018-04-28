package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FifthTask {
    private int row = 0;
    private int count_row = 15;
    public  JPanel panel = new JPanel();
    public JPanel tablePanel = new JPanel();
    private JTextField text5 = new JTextField();
    private JButton button5 = new JButton("Start");
    private JButton button6 = new JButton("1 >> 2");
    private JButton button7 = new JButton("2 >> 1");
    private JTable table = new JTable(count_row, 2);
    private JScrollPane scroll = new JScrollPane(table);

    public void Fifth() {
        panel.setPreferredSize(new Dimension( 650,135));
        scroll.setPreferredSize(new Dimension(300, 125));
        text5.setPreferredSize(new Dimension(100, 30));
        button5.setPreferredSize(new Dimension(75, 30));
        button6.setPreferredSize(new Dimension(75, 30));
        button7.setPreferredSize(new Dimension(75, 30));

        tablePanel.add(text5);
        tablePanel.add(button5);
        tablePanel.add(button6);
        tablePanel.add(button7);
        tablePanel.add(scroll);
        panel.add(tablePanel);

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!text5.getText().isEmpty()) {
                    if (row < count_row) {
                        table.setValueAt(text5.getText(), row, 0);
                        row++;
                    }
                    return;
                } else
                    JOptionPane.showMessageDialog(null, "Введите текст! ", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) != null) {
                    table.setValueAt(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()), table.getSelectedRow(), (table.getSelectedColumn() + 1));
                    table.setValueAt(null, table.getSelectedRow(), table.getSelectedColumn());
                } else
                    JOptionPane.showMessageDialog(null, "Выбранное место пустое", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
            });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) != null) {
                    table.setValueAt(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()), table.getSelectedRow(), (table.getSelectedColumn() - 1));
                    table.setValueAt(null, table.getSelectedRow(), table.getSelectedColumn());
                } else
                    JOptionPane.showMessageDialog(null, "Выбранное место пустое", "Внимание", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}
