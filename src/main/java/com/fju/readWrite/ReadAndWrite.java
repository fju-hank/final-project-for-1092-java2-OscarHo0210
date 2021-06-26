package com.fju.readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("TPE COVID-19 departure rule.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content = "";
            while (bufferedReader.ready()){
                content = bufferedReader.readLine();
                System.out.println("Ready to read txt");
                System.out.println(content);
            }

            FileWriter fileWriter = new FileWriter("TPE COVID-19 departure rule.txt");

        }catch(Exception exception){

        }
    }
}
