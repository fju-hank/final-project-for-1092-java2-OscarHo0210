package com.fju.readWrite;

import java.io.FileWriter;

public class ReadTxt {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("TPE COVID-19 departure rule.txt");
            fileWriter.write("Success");
            fileWriter.flush();
            fileWriter.close();
        }catch (Exception exception) {
            System.out.println("Error");

        }
    }
}
