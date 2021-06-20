package com.fju.planeUI;

import com.fju.Tester;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plane {
    private JPanel PanelMain;
    private JButton ConfirmButton;

    public Plane() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello world");
            }

        });

    }
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Plane");
        jFrame.setContentPane(new Plane().PanelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
