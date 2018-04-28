package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {
    public JFrame frame = new JFrame("GridBagLayout");
    private JButton buttonStart = new JButton("Start");
    private JButton buttonStop = new JButton("Stop");
    private JButton buttonExit = new JButton("Exit");
    private FlowLayout fl = new FlowLayout();
    private BorderLayout br = new BorderLayout();
    private GridBagLayout gr = new GridBagLayout();
    private Thread thread;
    private boolean isPressed = false;
    private long time = 2500;

    StartFrame() {
        super("Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 175);

        buttonStart.setSize(130, 30);
        buttonStop.setSize(130, 30);
        buttonExit.setSize(130, 30);
        buttonStart.setLocation(30, 10);
        buttonStop.setLocation(30, 50);
        buttonExit.setLocation(30, 90);
        add(buttonStart);
        add(buttonStop);
        add(buttonExit);
        setLayout(null);
    }

    public void ButtonListener() {
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressed = false;
                thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (!isPressed) {
                            try {
                                Thread.sleep(time);
                                frame.setVisible(false);
                                br.BorderLayout();
                                Thread.sleep(time);

                                fl.FlowLayout();
                                Thread.sleep(time);

                                gr.GridBagLayout(frame.getContentPane());
                                frame.pack();
                                frame.setLocationRelativeTo(null);
                                frame.setVisible(true);

                            } catch (InterruptedException e1) {
                                System.out.println("stop");
                            }
                        }
                    }
                });
                thread.start();
            }
        });

        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressed = true;
                thread.interrupt();
                br.th1.interrupt();
                fl.th.interrupt();
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}


