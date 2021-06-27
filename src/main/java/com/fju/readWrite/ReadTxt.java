package com.fju.readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
public class ReadTxt {
    public static void main(String[] args) {

        try{
            FileReader fileReader = new FileReader("TPE COVID-19 departure rule.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content = "";
            while (bufferedReader.ready()){
                content = bufferedReader.readLine();
                System.out.println(content);
            }

        }catch(Exception exception){
            System.out.println("Error");
        }

    }
}
