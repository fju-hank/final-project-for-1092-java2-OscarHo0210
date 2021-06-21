package com.fju.planeUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plane {
    private JPanel PanelMain;
    private JPanel PanelTop;
    private JPanel PanelLeft;
    private JPanel PanelRight;
    private JLabel FlightInformation;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton ConfirmButton;
    private JLabel LabelFlightNumber;
    private JLabel LabelName;
    private JLabel LabelPasswordId;



    public Plane() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello world");
            }

        });

    }
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Airplane");

        jFrame.setContentPane(new Plane().PanelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
