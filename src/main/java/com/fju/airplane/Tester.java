package com.fju.airplane;

import com.fju.airplane.checkIn.*;
import com.fju.airplane.flightInformation.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Airplane1(), new Airplane2(),
                new Airplane3(), new Airplane4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this is a flight information system" + "\n" + "Please enter your flight number: ");
        String flightNumber = scanner.next();
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your password ID: ");
        int passwordId = Integer.parseInt(scanner.next());
        System.out.println("Your flight number: " + flightNumber + ", Name: " + name + ", Password ID: " + passwordId);
        for (Airplane airplane : airplanes) {
            if (airplane.validate(flightNumber, name, passwordId)) {
                System.out.println("Flight Number: " + airplane.getFlightNumber() + "\n" + "Location:" + airplane.getLocation() + "\n" + "Arrive Time: " + airplane.getTime() + " / Carousel: "
                        + airplane.getBaggage() + " / Gate: " + airplane.getGate() + " / Plane's ID: " + airplane.getPlaneId());
            }
        }

        System.out.println("Go into the check in system?(Enter Yes / No)");
        String airInfo = scanner.next();
        if (airInfo.equals("Yes")){
            CheckIn[] checkIns = {new Check1(), new Check2(),
                    new Check3(), new Check4()};

            System.out.println("Check in system, please enter your board ID: ");
            int boardId = Integer.parseInt(scanner.next());
            System.out.println("Please confirm your information. (Enter Yes / No)" );
            for (CheckIn checkIn : checkIns) {
                if (checkIn.validate(boardId)) {
                    System.out.println("Password ID: " + checkIn.passwordId + "\n" + "Flight Number: " + checkIn.flightNumber + "\n" + "Seat: " + checkIn.seat + "\n" + "Departure Time: " + checkIn.departureTime);
                }
            }
            System.out.println("Is your information correct? (Enter Yes / No)" );
            String airInfo1 = scanner.next();
            if (airInfo1.equals("Yes")){
                System.out.println("Your check in is success. Thanks!");
            }else if (airInfo1.equals("No")){
                System.out.println("Your check in is not success.");
            }
        }else if (airInfo.equals("No")){
            System.out.println("OK, Bye!");
        }

    }
}