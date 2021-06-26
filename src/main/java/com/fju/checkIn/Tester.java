package com.fju.checkIn;

import com.fju.airplane.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        CheckIn[] checkIns = {new Check1(), new Check2(),
                new Check3(), new Check4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Check in system, please confirm your information. (Enter Yes / No)" );
        String airInfo = scanner.next();
        if (airInfo.equals("Yes")){
            for (CheckIn checkIn : checkIns) {
                if (checkIn.validate(checkIn.passwordId)) {
                    System.out.println("Password ID: " + checkIn.passwordId + "\n" + "Flight Number: " + checkIn.flightNumber + "\n" + "Seat: " + checkIn.seat + "\n" + "Departure Time: " + checkIn.flightNumber);
                }
            }
            System.out.println("Hello, welcome to check in system.");
        }else if (airInfo.equals("No")){
            System.out.println("OK, Bye!");
        }


    }


}
