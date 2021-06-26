package com.fju.checkIn;

import com.fju.airplane.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        CheckIn[] checkIns = {new Check1(), new Check2(),
                new Check3(), new Check4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Check in system, please enter your board ID: ");
        int boardId = Integer.parseInt(scanner.next());
        System.out.println("Please confirm your information. (Enter Yes / No)" );
        String airInfo = scanner.next();
        if (airInfo.equals("Yes")){
            System.out.println("Hello, welcome to check in system.");
        }else if (airInfo.equals("No")){
            System.out.println("OK, Bye!");
        }
        for (CheckIn checkIn : checkIns) {
            if (checkIn.validate(boardId)) {
                System.out.println("Password ID: " + checkIn.passwordId + "\n" + "Flight Number: " + checkIn.flightNumber + "\n" + "Seat: " + checkIn.seat + "\n" + "Departure Time: " + checkIn.departureTime);
            }
        }
        System.out.println("Is your information correct. (Enter Yes / No)" );
        String airInfo1 = scanner.next();
        if (airInfo1.equals("Yes")){
            System.out.println("Your check in is success. Thanks!");
        }else if (airInfo1.equals("No")){
            System.out.println("Your information is not correct.");
        }



    }


}
