package com.fju.checkIn;

import com.fju.airplane.Tester;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckIn extends Tester {
    public static void main(String[] args) {
        int passwordId;
        String flightNumber;
        String seat;
        String departureTime;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Check in system.(Enter Yes / No)");
        String airInfo = scanner.next();
        if (airInfo.equals("Yes")){
            System.out.println("Hello, welcome to check in system.");
        }else if (airInfo.equals("No")){
            System.out.println("OK, Bye!");
        }

    }

}
