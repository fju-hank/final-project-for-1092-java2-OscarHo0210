package com.fju.planeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CheckInGUI {
    private JPanel PanelTop;
    private JLabel CheckInSystem;
    private JPanel PanelLeft;
    private JPanel PanelRight;
    private JLabel LabelCheckIn;
    private JTextField textField1;
    private JLabel LabelName;
    private JTextField textField2;
    private JButton ConfirmButton;
    private JButton TPECOVID19DepartureButton;
    private JButton TPEButton;
    private JPanel CheckInPanel;


    public CheckInGUI() {

        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your check in is success. Thanks!");
            }

        });


        TPECOVID19DepartureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    FileReader fileReader = new FileReader("TPE COVID-19 departure rule.txt"); //提供COVID-19的相關離闖資訊
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String content = "";
                    while (bufferedReader.ready()){
                        content = bufferedReader.readLine();
                        System.out.println(content);
                    }
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        TPEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.taoyuan-airport.com/main_ch/index.aspx")); //網路連線至桃園機場官方網站
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } catch (URISyntaxException uriSyntaxException) {
                        uriSyntaxException.printStackTrace();
                    }
                } finally {

                }
            }


        });


    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Airplane");

        jFrame.setContentPane(new CheckInGUI().CheckInPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
