package com.fju.airplane;

import com.fju.airplane.*;

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
            System.out.println("Hello, welcome to check in system.");
        }else if (airInfo.equals("No")){
            System.out.println("OK, Bye!");
        }

    }
}