package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Airplane1(), new Airplane2(),
                new Airplane3(), new Airplane4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your password ID: ");
        int passwordId = Integer.parseInt(scanner.next());
        System.out.println("Your flight number: " + flightNumber + ", Name: " + name + ", Password ID: " + passwordId);
        for (Airplane airplane : airplanes) {
            if (airplane.validate(flightNumber, name, passwordId)) {
                System.out.println("Flight Number: " + airplane.getFlightNumber() + "\n" + "Location:" + airplane.getLocation() + "\n" + "Time: " + airplane.getTime() + " / Carousel: "
                        + airplane.getBaggage() + " / Gate: " + airplane.getGate() + " / Plane's ID: " + airplane.getPlaneId());
                break;
            }
        }

    }
}