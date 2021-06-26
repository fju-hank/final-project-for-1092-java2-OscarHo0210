package com.fju.checkIn;

import com.fju.Tester;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIn extends Tester {
    public static void main(String[] args) {
        int passwordId;
        String flightNumber;
        String seat;
        String departureTime;

        try{
            Scanner scanner = new Scanner(System.in);
            while (true){
                passwordId = scanner.nextInt();
                if (passwordId == 0){
                    System.out.println("Your Flight number: " +  "Your seat: " );
                }
            }
        }catch (InputMismatchException exception){
            System.out.println();
        }

    }

}
